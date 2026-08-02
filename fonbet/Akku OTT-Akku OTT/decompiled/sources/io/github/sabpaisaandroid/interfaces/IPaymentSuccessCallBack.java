package io.github.sabpaisaandroid.interfaces;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lio/github/sabpaisaandroid/interfaces/IPaymentSuccessCallBack;", ExifInterface.GPS_DIRECTION_TRUE, "", "onPaymentFail", "", Constants.MESSAGE, "(Ljava/lang/Object;)V", "onPaymentSuccess", "response", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IPaymentSuccessCallBack<T> {
    void onPaymentFail(T message);

    void onPaymentSuccess(T response);
}
