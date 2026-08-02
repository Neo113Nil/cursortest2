package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\u0006\u0010\n\u001aO\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003¢\u0006\u0004\b\u000b\u0010\u0007\u001aE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "transform", "map", "(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "Landroidx/arch/core/util/Function;", "mapFunction", "(Landroidx/lifecycle/LiveData;Landroidx/arch/core/util/Function;)Landroidx/lifecycle/LiveData;", "switchMap", "switchMapFunction", "distinctUntilChanged", "(Landroidx/lifecycle/LiveData;)Landroidx/lifecycle/LiveData;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Transformations {
    public static final <X, Y> androidx.view.LiveData<Y> map(androidx.view.LiveData<X> liveData, final kotlin.jvm.functions.Function1<X, Y> function1) {
        final androidx.view.MediatorLiveData mediatorLiveData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (liveData.isInitialized()) {
            mediatorLiveData = new androidx.view.MediatorLiveData(function1.invoke(liveData.getValue()));
        } else {
            mediatorLiveData = new androidx.view.MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new androidx.view.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.Transformations.$r8$lambda$BwsyosKDy1r8_Av_UBqlp5IVnEE(androidx.view.MediatorLiveData.this, function1, obj);
            }
        }));
        return mediatorLiveData;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ androidx.view.LiveData map(androidx.view.LiveData liveData, final androidx.arch.core.util.Function function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        final androidx.view.MediatorLiveData mediatorLiveData = new androidx.view.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.view.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.Transformations.m9165$r8$lambda$E4I8eRLL86MxeijTw6DXO8_TO4(androidx.view.MediatorLiveData.this, function, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final <X, Y> androidx.view.LiveData<Y> switchMap(androidx.view.LiveData<X> liveData, final kotlin.jvm.functions.Function1<X, androidx.view.LiveData<Y>> function1) {
        final androidx.view.MediatorLiveData mediatorLiveData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        if (liveData.isInitialized()) {
            androidx.view.LiveData<Y> invoke = function1.invoke(liveData.getValue());
            if (invoke != null && invoke.isInitialized()) {
                mediatorLiveData = new androidx.view.MediatorLiveData(invoke.getValue());
            } else {
                mediatorLiveData = new androidx.view.MediatorLiveData();
            }
        } else {
            mediatorLiveData = new androidx.view.MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new androidx.view.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.Transformations.$r8$lambda$98tZo58L6aBhj8JjEcBYpguqa0s(kotlin.jvm.functions.Function1.this, objectRef, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ androidx.view.LiveData switchMap(androidx.view.LiveData liveData, androidx.arch.core.util.Function function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        androidx.view.MediatorLiveData mediatorLiveData = new androidx.view.MediatorLiveData();
        mediatorLiveData.addSource(liveData, new androidx.view.Transformations$switchMap$2(function, mediatorLiveData));
        return mediatorLiveData;
    }

    public static final <X> androidx.view.LiveData<X> distinctUntilChanged(androidx.view.LiveData<X> liveData) {
        final androidx.view.MediatorLiveData mediatorLiveData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            booleanRef.element = false;
            mediatorLiveData = new androidx.view.MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new androidx.view.MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new androidx.view.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.Transformations.$r8$lambda$GbNWMx7KSDgmk1Mk1w7WtdX1a2E(androidx.view.MediatorLiveData.this, booleanRef, obj);
            }
        }));
        return mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.lifecycle.LiveData] */
    public static /* synthetic */ kotlin.Unit $r8$lambda$98tZo58L6aBhj8JjEcBYpguqa0s(kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.Ref.ObjectRef objectRef, final androidx.view.MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        ?? r0 = (androidx.view.LiveData) function1.invoke(obj);
        if (objectRef.element != r0) {
            if (objectRef.element != 0) {
                T t = objectRef.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                mediatorLiveData.removeSource((androidx.view.LiveData) t);
            }
            objectRef.element = r0;
            if (objectRef.element != 0) {
                T t2 = objectRef.element;
                kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                mediatorLiveData.addSource((androidx.view.LiveData) t2, new androidx.view.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.Transformations$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.view.Transformations.$r8$lambda$skahzJt915myAFMlecWfN1CaVsE(androidx.view.MediatorLiveData.this, obj2);
                    }
                }));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BwsyosKDy1r8_Av_UBqlp5IVnEE(androidx.view.MediatorLiveData mediatorLiveData, kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        mediatorLiveData.setValue(function1.invoke(obj));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$E4I8eRLL86MxeijTw6DXO8_T-O4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9165$r8$lambda$E4I8eRLL86MxeijTw6DXO8_TO4(androidx.view.MediatorLiveData mediatorLiveData, androidx.arch.core.util.Function function, java.lang.Object obj) {
        mediatorLiveData.setValue(function.apply(obj));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GbNWMx7KSDgmk1Mk1w7WtdX1a2E(androidx.view.MediatorLiveData mediatorLiveData, kotlin.jvm.internal.Ref.BooleanRef booleanRef, java.lang.Object obj) {
        T value = mediatorLiveData.getValue();
        if (booleanRef.element || ((value == 0 && obj != null) || (value != 0 && !kotlin.jvm.internal.Intrinsics.areEqual(value, obj)))) {
            booleanRef.element = false;
            mediatorLiveData.setValue(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$skahzJt915myAFMlecWfN1CaVsE(androidx.view.MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        mediatorLiveData.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }
}
