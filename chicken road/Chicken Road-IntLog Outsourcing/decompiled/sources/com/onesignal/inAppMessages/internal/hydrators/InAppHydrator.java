package com.onesignal.inAppMessages.internal.hydrators;

import com.onesignal.common.modeling.MapModel;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppHydrator {
    public static final Companion Companion = new Companion(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final PropertiesModelStore _propertiesModelStore;
    private final ITime _time;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppHydrator(ITime _time, PropertiesModelStore _propertiesModelStore) {
        i.e(_time, "_time");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        this._time = _time;
        this._propertiesModelStore = _propertiesModelStore;
    }

    private final String taggedHTMLString(String str) {
        MapModel<String> tags = this._propertiesModelStore.getModel().getTags();
        i.c(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String jSONObject = new JSONObject(tags).toString();
        i.d(jSONObject, "toString(...)");
        return str + String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{jSONObject}, 1));
    }

    public final InAppMessageContent hydrateIAMMessageContent(JSONObject jsonObject) {
        i.e(jsonObject, "jsonObject");
        try {
            InAppMessageContent inAppMessageContent = new InAppMessageContent(jsonObject);
            if (inAppMessageContent.getContentHtml() == null) {
                Logging.info$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = inAppMessageContent.getContentHtml();
            i.b(contentHtml);
            inAppMessageContent.setContentHtml(taggedHTMLString(contentHtml));
            return inAppMessageContent;
        } catch (JSONException e3) {
            Logging.error("Error attempting to hydrate InAppMessageContent: " + jsonObject, e3);
            return null;
        }
    }

    public final List<InAppMessage> hydrateIAMMessages(JSONArray jsonArray) {
        i.e(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i2);
            i.d(jSONObject, "getJSONObject(...)");
            InAppMessage inAppMessage = new InAppMessage(jSONObject, this._time);
            if (inAppMessage.getMessageId() != null) {
                arrayList.add(inAppMessage);
            }
        }
        return arrayList;
    }
}
