package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Lkotlin/coroutines/CoroutineContext$Element;", "", "getScaleFactor", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MotionDurationScale extends kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final androidx.compose.ui.MotionDurationScale.Companion INSTANCE = androidx.compose.ui.MotionDurationScale.Companion.Camera2StreamConfigurationMap;

    float getScaleFactor();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static <R> R fold(androidx.compose.ui.MotionDurationScale motionDurationScale, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(motionDurationScale, r, function2);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(androidx.compose.ui.MotionDurationScale motionDurationScale, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(motionDurationScale, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(androidx.compose.ui.MotionDurationScale motionDurationScale, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(motionDurationScale, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(androidx.compose.ui.MotionDurationScale motionDurationScale, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(motionDurationScale, coroutineContext);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/MotionDurationScale;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.MotionDurationScale$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<androidx.compose.ui.MotionDurationScale> {
        static final /* synthetic */ androidx.compose.ui.MotionDurationScale.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.MotionDurationScale.Companion();

        private Companion() {
        }
    }
}
