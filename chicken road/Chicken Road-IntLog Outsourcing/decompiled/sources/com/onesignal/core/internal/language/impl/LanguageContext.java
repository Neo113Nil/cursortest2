package com.onesignal.core.internal.language.impl;

import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LanguageContext implements ILanguageContext {
    private final PropertiesModelStore _propertiesModelStore;
    private LanguageProviderDevice deviceLanguageProvider;

    public LanguageContext(PropertiesModelStore _propertiesModelStore) {
        i.e(_propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = _propertiesModelStore;
        this.deviceLanguageProvider = new LanguageProviderDevice();
    }

    @Override // com.onesignal.core.internal.language.ILanguageContext
    public String getLanguage() {
        String language = this._propertiesModelStore.getModel().getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // com.onesignal.core.internal.language.ILanguageContext
    public void setLanguage(String value) {
        i.e(value, "value");
        this._propertiesModelStore.getModel().setLanguage(value);
    }
}
