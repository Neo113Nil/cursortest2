package androidx.glance.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/glance/text/FontFamily;", "", "family", "", "(Ljava/lang/String;)V", "getFamily", "()Ljava/lang/String;", "toString", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamily {
    public static final int $stable = 0;
    private final String family;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FontFamily Serif = new FontFamily("serif");
    private static final FontFamily SansSerif = new FontFamily("sans-serif");
    private static final FontFamily Monospace = new FontFamily("monospace");
    private static final FontFamily Cursive = new FontFamily("cursive");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/glance/text/FontFamily$Companion;", "", "()V", "Cursive", "Landroidx/glance/text/FontFamily;", "getCursive", "()Landroidx/glance/text/FontFamily;", "Monospace", "getMonospace", "SansSerif", "getSansSerif", "Serif", "getSerif", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final FontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final FontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final FontFamily getSerif() {
            return FontFamily.Serif;
        }

        private Companion() {
        }
    }

    public FontFamily(String str) {
        this.family = str;
    }

    public final String getFamily() {
        return this.family;
    }

    public String toString() {
        return this.family;
    }
}
