package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0090@¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R,\u0010!\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/paging/WrapperDataSource;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "source", "Landroidx/arch/core/util/Function;", "", "listFunction", "<init>", "(Landroidx/paging/DataSource;Landroidx/arch/core/util/Function;)V", "Landroidx/paging/DataSource$InvalidatedCallback;", "onInvalidatedCallback", "", "addInvalidatedCallback", "(Landroidx/paging/DataSource$InvalidatedCallback;)V", "removeInvalidatedCallback", "invalidate", "()V", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "dest", "stashKeysIfNeeded", "(Ljava/util/List;Ljava/util/List;)V", "Landroidx/paging/DataSource$Params;", "params", "Landroidx/paging/DataSource$BaseResult;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/DataSource;", "Camera2StreamConfigurationMap", "Landroidx/arch/core/util/Function;", "Ljava/util/IdentityHashMap;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/IdentityHashMap;", "getHighSpeedVideoFpsRanges", "", "isInvalid", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends androidx.paging.DataSource<Key, ValueTo> {
    private final androidx.arch.core.util.Function<java.util.List<ValueFrom>, java.util.List<ValueTo>> Camera2StreamConfigurationMap;
    private final androidx.paging.DataSource<Key, ValueFrom> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.IdentityHashMap<ValueTo, Key> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource(androidx.paging.DataSource<Key, ValueFrom> dataSource, androidx.arch.core.util.Function<java.util.List<ValueFrom>, java.util.List<ValueTo>> function) {
        super(dataSource.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dataSource;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRanges = androidx.paging.WrapperDataSource.WhenMappings.$EnumSwitchMapping$0[dataSource.getType().ordinal()] == 1 ? new java.util.IdentityHashMap<>() : null;
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(androidx.paging.DataSource.InvalidatedCallback onInvalidatedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidatedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.addInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(androidx.paging.DataSource.InvalidatedCallback onInvalidatedCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidatedCallback, "");
        this.getHighResolutionOutputSizeshNQ4ISI.removeInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.getHighResolutionOutputSizeshNQ4ISI.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isInvalid();
    }

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common(ValueTo item) {
        Key key;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.util.IdentityHashMap<ValueTo, Key> identityHashMap = this.getHighSpeedVideoFpsRanges;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                key = this.getHighSpeedVideoFpsRanges.get(item);
                kotlin.jvm.internal.Intrinsics.checkNotNull(key);
            }
            return key;
        }
        throw new java.lang.IllegalStateException("Cannot get key by item in non-item keyed DataSource");
    }

    public final void stashKeysIfNeeded(java.util.List<? extends ValueFrom> source, java.util.List<? extends ValueTo> dest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        java.util.IdentityHashMap<ValueTo, Key> identityHashMap = this.getHighSpeedVideoFpsRanges;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                int size = dest.size();
                for (int i = 0; i < size; i++) {
                    java.util.IdentityHashMap<ValueTo, Key> identityHashMap2 = this.getHighSpeedVideoFpsRanges;
                    ValueTo valueto = dest.get(i);
                    androidx.paging.DataSource<Key, ValueFrom> dataSource = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(dataSource, "");
                    identityHashMap2.put(valueto, ((androidx.paging.ItemKeyedDataSource) dataSource).getKey(source.get(i)));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <Key, ValueFrom, ValueTo> java.lang.Object Camera2StreamConfigurationMap(androidx.paging.WrapperDataSource<Key, ValueFrom, ValueTo> wrapperDataSource, androidx.paging.DataSource.Params<Key> params, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<ValueTo>> continuation) {
        androidx.paging.WrapperDataSource$load$1 wrapperDataSource$load$1;
        int i;
        androidx.paging.WrapperDataSource wrapperDataSource2;
        if (continuation instanceof androidx.paging.WrapperDataSource$load$1) {
            wrapperDataSource$load$1 = (androidx.paging.WrapperDataSource$load$1) continuation;
            if ((wrapperDataSource$load$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                wrapperDataSource$load$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = wrapperDataSource$load$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wrapperDataSource$load$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.paging.DataSource<Key, ValueFrom> dataSource = ((androidx.paging.WrapperDataSource) wrapperDataSource).getHighResolutionOutputSizeshNQ4ISI;
                    wrapperDataSource$load$1.getHighSpeedVideoSizes = wrapperDataSource;
                    wrapperDataSource$load$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = dataSource.load$paging_common(params, wrapperDataSource$load$1);
                    wrapperDataSource2 = wrapperDataSource;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z = (androidx.paging.WrapperDataSource<Key, ValueFrom, ValueTo>) ((androidx.paging.WrapperDataSource) wrapperDataSource$load$1.getHighSpeedVideoSizes);
                    kotlin.ResultKt.throwOnFailure(obj);
                    wrapperDataSource2 = z;
                }
                androidx.paging.DataSource.BaseResult baseResult = (androidx.paging.DataSource.BaseResult) obj;
                androidx.paging.DataSource.BaseResult convert$paging_common = androidx.paging.DataSource.BaseResult.INSTANCE.convert$paging_common(baseResult, wrapperDataSource2.Camera2StreamConfigurationMap);
                wrapperDataSource2.stashKeysIfNeeded(baseResult.data, convert$paging_common.data);
                return convert$paging_common;
            }
        }
        wrapperDataSource$load$1 = new androidx.paging.WrapperDataSource$load$1(wrapperDataSource, continuation);
        java.lang.Object obj2 = wrapperDataSource$load$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wrapperDataSource$load$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        androidx.paging.DataSource.BaseResult baseResult2 = (androidx.paging.DataSource.BaseResult) obj2;
        androidx.paging.DataSource.BaseResult convert$paging_common2 = androidx.paging.DataSource.BaseResult.INSTANCE.convert$paging_common(baseResult2, wrapperDataSource2.Camera2StreamConfigurationMap);
        wrapperDataSource2.stashKeysIfNeeded(baseResult2.data, convert$paging_common2.data);
        return convert$paging_common2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.DataSource.KeyType.values().length];
            try {
                iArr[androidx.paging.DataSource.KeyType.ITEM_KEYED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.paging.DataSource
    public java.lang.Object load$paging_common(androidx.paging.DataSource.Params<Key> params, kotlin.coroutines.Continuation<? super androidx.paging.DataSource.BaseResult<ValueTo>> continuation) {
        return Camera2StreamConfigurationMap(this, params, continuation);
    }
}
