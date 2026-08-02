package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseTokenLiveData;
import j$.time.Duration;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.O;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;J)Landroidx/lifecycle/LiveData;", "asFlow", "(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/e;", "j$/time/Duration", "timeout", "(Lkotlinx/coroutines/flow/e;Lj$/time/Duration;Lkotlin/coroutines/CoroutineContext;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "FlowLiveDataConversions")
/* loaded from: classes.dex */
public final class FlowLiveDataConversions {
    public static final <T> InterfaceC1060e<T> asFlow(LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        return C1062g.a(C1062g.b(new FlowLiveDataConversions$asFlow$1(liveData, null)), -1);
    }

    @JvmOverloads
    public static final <T> LiveData<T> asLiveData(InterfaceC1060e<? extends T> interfaceC1060e) {
        Intrinsics.checkNotNullParameter(interfaceC1060e, "<this>");
        return asLiveData$default(interfaceC1060e, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC1060e interfaceC1060e, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(interfaceC1060e, coroutineContext, j);
    }

    @JvmOverloads
    public static final <T> LiveData<T> asLiveData(InterfaceC1060e<? extends T> interfaceC1060e, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(interfaceC1060e, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData$default(interfaceC1060e, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public static final <T> LiveData<T> asLiveData(InterfaceC1060e<? extends T> interfaceC1060e, CoroutineContext context, long j) {
        Intrinsics.checkNotNullParameter(interfaceC1060e, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        FlutterFirebaseTokenLiveData flutterFirebaseTokenLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j, new FlowLiveDataConversions$asLiveData$1(interfaceC1060e, null));
        if (interfaceC1060e instanceof O) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                flutterFirebaseTokenLiveData.setValue(((O) interfaceC1060e).getValue());
                return flutterFirebaseTokenLiveData;
            }
            flutterFirebaseTokenLiveData.postValue(((O) interfaceC1060e).getValue());
        }
        return flutterFirebaseTokenLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC1060e interfaceC1060e, Duration duration, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(interfaceC1060e, duration, coroutineContext);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC1060e<? extends T> interfaceC1060e, Duration timeout, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(interfaceC1060e, "<this>");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData(interfaceC1060e, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
