package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018À\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectKCallable;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/reflect/KCallable;", "", "Lkotlin/reflect/KParameter;", "", "args", "Lkotlin/coroutines/Continuation;", "continuationArgument", "callDefaultMethod", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "getRawBoundReceiver", "()Ljava/lang/Object;", "rawBoundReceiver", "", "getReceiverParameters", "()Ljava/util/List;", "receiverParameters", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ReflectKCallable<R> extends kotlin.reflect.KCallable<R> {
    R callDefaultMethod(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> args, kotlin.coroutines.Continuation<?> continuationArgument);

    kotlin.reflect.jvm.internal.calls.Caller<?> getCaller();

    kotlin.reflect.jvm.internal.KDeclarationContainerImpl getContainer();

    kotlin.reflect.jvm.internal.calls.Caller<?> getDefaultCaller();

    java.lang.Object getRawBoundReceiver();

    java.util.List<kotlin.reflect.KParameter> getReceiverParameters();
}
