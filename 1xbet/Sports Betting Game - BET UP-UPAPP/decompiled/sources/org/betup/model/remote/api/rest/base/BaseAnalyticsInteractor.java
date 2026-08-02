package org.betup.model.remote.api.rest.base;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.infrastructure.AnalyticsApi;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BaseAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¨\u0006\u000b"}, d2 = {"Lorg/betup/model/remote/api/rest/base/BaseAnalyticsInteractor;", "T", ExifInterface.LATITUDE_SOUTH, "Lorg/betup/model/remote/api/rest/base/BaseTokenInteractor;", "Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getApi", "Ljava/lang/Class;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAnalyticsInteractor<T, S> extends BaseTokenInteractor<T, S, AnalyticsApi> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAnalyticsInteractor(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // org.betup.model.remote.api.rest.base.BaseInteractor
    public Class<AnalyticsApi> getApi() {
        return AnalyticsApi.class;
    }
}
