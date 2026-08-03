package androidx.compose.runtime.collection;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* compiled from: IdentityArrayMap.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1", f = "IdentityArrayMap.kt", i = {0, 0}, l = {229}, m = "invokeSuspend", n = {"$this$sequence", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0"})
/* loaded from: classes.dex */
final class IdentityArrayMap$asMap$1$entries$1$iterator$1<Key, Value> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.Map.Entry<? extends Key, ? extends Value>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityArrayMap$asMap$1$entries$1$iterator$1(androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> identityArrayMap, kotlin.coroutines.Continuation<? super androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = identityArrayMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1 identityArrayMap$asMap$1$entries$1$iterator$1 = new androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1(this.this$0, continuation);
        identityArrayMap$asMap$1$entries$1$iterator$1.L$0 = obj;
        return identityArrayMap$asMap$1$entries$1$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.util.Map.Entry<? extends Key, ? extends Value>> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0046 -> B:5:0x0049). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int size;
        int i;
        kotlin.sequences.SequenceScope sequenceScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
            size = this.this$0.getSize();
            i = 0;
            sequenceScope = sequenceScope2;
            if (i < size) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            i = this.I$0;
            sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            i++;
            if (i < size) {
                this.L$0 = sequenceScope;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                if (sequenceScope.yield(new androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1.AnonymousClass1(this.this$0, i), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < size) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    /* compiled from: IdentityArrayMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010&\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R\u0016\u0010\u0002\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1", "", com.ironsource.X3.i.W, "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", "getValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements java.util.Map.Entry<Key, Value>, kotlin.jvm.internal.markers.KMappedMarker {
        private final Key key;
        private final Value value;

        @Override // java.util.Map.Entry
        public Value setValue(Value value) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1(androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> identityArrayMap, int i) {
            Key key = (Key) identityArrayMap.getKeys()[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(key, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            this.key = key;
            this.value = (Value) identityArrayMap.getValues()[i];
        }

        @Override // java.util.Map.Entry
        public Key getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Value getValue() {
            return this.value;
        }
    }
}
