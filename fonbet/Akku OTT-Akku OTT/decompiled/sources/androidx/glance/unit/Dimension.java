package androidx.glance.unit;

import androidx.annotation.DimenRes;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/glance/unit/Dimension;", "", "()V", "Dp", "Expand", "Fill", "Resource", "Wrap", "Landroidx/glance/unit/Dimension$Dp;", "Landroidx/glance/unit/Dimension$Expand;", "Landroidx/glance/unit/Dimension$Fill;", "Landroidx/glance/unit/Dimension$Resource;", "Landroidx/glance/unit/Dimension$Wrap;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class Dimension {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/glance/unit/Dimension$Dp;", "Landroidx/glance/unit/Dimension;", "dp", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDp-D9Ej5fM", "()F", "F", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dp extends Dimension {
        public static final int $stable = 0;
        private final float dp;

        public /* synthetic */ Dp(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        /* renamed from: getDp-D9Ej5fM, reason: not valid java name and from getter */
        public final float getDp() {
            return this.dp;
        }

        private Dp(float f) {
            super(null);
            this.dp = f;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/unit/Dimension$Expand;", "Landroidx/glance/unit/Dimension;", "()V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Expand extends Dimension {
        public static final int $stable = 0;
        public static final Expand INSTANCE = new Expand();

        private Expand() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/unit/Dimension$Fill;", "Landroidx/glance/unit/Dimension;", "()V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fill extends Dimension {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/unit/Dimension$Resource;", "Landroidx/glance/unit/Dimension;", "res", "", "(I)V", "getRes", "()I", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Resource extends Dimension {
        public static final int $stable = 0;
        private final int res;

        public Resource(@DimenRes int i) {
            super(null);
            this.res = i;
        }

        public final int getRes() {
            return this.res;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/unit/Dimension$Wrap;", "Landroidx/glance/unit/Dimension;", "()V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Wrap extends Dimension {
        public static final int $stable = 0;
        public static final Wrap INSTANCE = new Wrap();

        private Wrap() {
            super(null);
        }
    }

    public /* synthetic */ Dimension(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Dimension() {
    }
}
