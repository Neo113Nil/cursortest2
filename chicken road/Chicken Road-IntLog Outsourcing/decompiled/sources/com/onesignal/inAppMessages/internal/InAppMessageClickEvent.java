package com.onesignal.inAppMessages.internal;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.IInAppMessage;
import com.onesignal.inAppMessages.IInAppMessageClickEvent;
import com.onesignal.inAppMessages.IInAppMessageClickResult;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InAppMessageClickEvent implements IInAppMessageClickEvent {
    private final InAppMessage _message;
    private final InAppMessageClickResult _result;

    public InAppMessageClickEvent(InAppMessage msg, InAppMessageClickResult actn) {
        i.e(msg, "msg");
        i.e(actn, "actn");
        this._message = msg;
        this._result = actn;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickEvent
    public IInAppMessage getMessage() {
        return this._message;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessageClickEvent
    public IInAppMessageClickResult getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, this._message.toJSONObject()).put("action", this._result.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
