package org.betup.model.remote.api.rest.error;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import org.betup.model.remote.entity.error.ErrorModel;

/* loaded from: classes2.dex */
public class ErrorsJsonParser {
    public static String parse(String result) {
        ErrorModel errorModel = new ErrorModel();
        if (!TextUtils.isEmpty(result)) {
            errorModel = (ErrorModel) new GsonBuilder().create().fromJson(result, ErrorModel.class);
        }
        return !TextUtils.isEmpty(errorModel.getMeta().getErrorMessage()) ? errorModel.getMeta().getErrorMessage() : "Uknown error, try again later";
    }
}
