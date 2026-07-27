package com.onesignal.user.internal;

import com.onesignal.common.IDManager;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.MapModel;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.IUserManager;
import com.onesignal.user.internal.backend.IdentityConstants;
import com.onesignal.user.internal.customEvents.ICustomEventController;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionList;
import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.state.UserState;
import com.onesignal.user.subscriptions.IPushSubscription;
import g4.AbstractC0476u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class UserManager implements IUserManager, ISingletonModelStoreChangeHandler<IdentityModel> {
    private final ICustomEventController _customEventController;
    private final IdentityModelStore _identityModelStore;
    private final ILanguageContext _languageContext;
    private final PropertiesModelStore _propertiesModelStore;
    private final ISubscriptionManager _subscriptionManager;
    private final EventProducer<IUserStateObserver> changeHandlersNotifier;

    public UserManager(ISubscriptionManager _subscriptionManager, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, ICustomEventController _customEventController, ILanguageContext _languageContext) {
        i.e(_subscriptionManager, "_subscriptionManager");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_customEventController, "_customEventController");
        i.e(_languageContext, "_languageContext");
        this._subscriptionManager = _subscriptionManager;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._customEventController = _customEventController;
        this._languageContext = _languageContext;
        this.changeHandlersNotifier = new EventProducer<>();
        _identityModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    private final IdentityModel get_identityModel() {
        return this._identityModelStore.getModel();
    }

    private final PropertiesModel get_propertiesModel() {
        return this._propertiesModelStore.getModel();
    }

    @Override // com.onesignal.user.IUserManager
    public void addAlias(String label, String id) {
        i.e(label, "label");
        i.e(id, "id");
        Logging.log(LogLevel.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot add empty alias");
        } else if (label.equals(IdentityConstants.ONESIGNAL_ID)) {
            Logging.log(LogLevel.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((IdentityModel) label, id);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addAliases(Map<String, String> aliases) {
        i.e(aliases, "aliases");
        Logging.log(LogLevel.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot add empty alias");
                return;
            } else if (i.a(entry.getKey(), IdentityConstants.ONESIGNAL_ID)) {
                Logging.log(LogLevel.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put((IdentityModel) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addEmail(String email) {
        i.e(email, "email");
        Logging.log(LogLevel.DEBUG, "addEmail(email: " + email + ')');
        if (OneSignalUtils.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
        } else {
            Logging.log(LogLevel.ERROR, "Cannot add invalid email address as subscription: ".concat(email));
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addObserver(IUserStateObserver observer) {
        i.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // com.onesignal.user.IUserManager
    public void addSms(String sms) {
        i.e(sms, "sms");
        Logging.log(LogLevel.DEBUG, "addSms(sms: " + sms + ')');
        if (OneSignalUtils.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
        } else {
            Logging.log(LogLevel.ERROR, "Cannot add invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addTag(String key, String value) {
        i.e(key, "key");
        i.e(value, "value");
        Logging.log(LogLevel.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((MapModel<String>) key, value);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void addTags(Map<String, String> tags) {
        i.e(tags, "tags");
        Logging.log(LogLevel.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put((MapModel<String>) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        IdentityModel identityModel = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : identityModel.entrySet()) {
            if (!i.a(entry.getKey(), OutcomeConstants.OUTCOME_ID)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0476u.d0(linkedHashMap);
    }

    public final EventProducer<IUserStateObserver> getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // com.onesignal.user.IUserManager
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // com.onesignal.user.IUserManager
    public String getOnesignalId() {
        return IDManager.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // com.onesignal.user.IUserManager
    public IPushSubscription getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final SubscriptionList getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // com.onesignal.user.IUserManager
    public Map<String, String> getTags() {
        return AbstractC0476u.d0(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(IdentityModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (i.a(args.getProperty(), IdentityConstants.ONESIGNAL_ID)) {
            this.changeHandlersNotifier.fire(new UserManager$onModelUpdated$1(new UserState(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeAlias(String label) {
        i.e(label, "label");
        Logging.log(LogLevel.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot remove empty alias");
        } else if (label.equals(IdentityConstants.ONESIGNAL_ID)) {
            Logging.log(LogLevel.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeAliases(Collection<String> labels) {
        i.e(labels, "labels");
        Logging.log(LogLevel.DEBUG, "removeAliases(labels: " + labels + ')');
        for (String str : labels) {
            if (str.length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot remove empty alias");
                return;
            } else if (i.a(str, IdentityConstants.ONESIGNAL_ID)) {
                Logging.log(LogLevel.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeEmail(String email) {
        i.e(email, "email");
        Logging.log(LogLevel.DEBUG, "removeEmail(email: " + email + ')');
        if (OneSignalUtils.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
        } else {
            Logging.log(LogLevel.ERROR, "Cannot remove invalid email address as subscription: ".concat(email));
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeObserver(IUserStateObserver observer) {
        i.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // com.onesignal.user.IUserManager
    public void removeSms(String sms) {
        i.e(sms, "sms");
        Logging.log(LogLevel.DEBUG, "removeSms(sms: " + sms + ')');
        if (OneSignalUtils.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
        } else {
            Logging.log(LogLevel.ERROR, "Cannot remove invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeTag(String key) {
        i.e(key, "key");
        Logging.log(LogLevel.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            Logging.log(LogLevel.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void removeTags(Collection<String> keys) {
        i.e(keys, "keys");
        Logging.log(LogLevel.DEBUG, "removeTags(keys: " + keys + ')');
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                Logging.log(LogLevel.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = keys.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // com.onesignal.user.IUserManager
    public void setLanguage(String value) {
        i.e(value, "value");
        this._languageContext.setLanguage(value);
    }

    @Override // com.onesignal.user.IUserManager
    public void trackEvent(String name, Map<String, ? extends Object> map) {
        i.e(name, "name");
        if (JSONUtils.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(name, map);
        } else {
            Logging.log(LogLevel.ERROR, "Custom event properties are not JSON-serializable");
        }
    }
}
