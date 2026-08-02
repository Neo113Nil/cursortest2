package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationBackground;", "", "<init>", "()V", "Companion", "ColorBackground", "DefaultBackground"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class EmbeddingAnimationBackground {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.EmbeddingAnimationBackground.Companion INSTANCE = new androidx.window.embedding.EmbeddingAnimationBackground.Companion(null);
    public static final androidx.window.embedding.EmbeddingAnimationBackground DEFAULT = new androidx.window.embedding.EmbeddingAnimationBackground.DefaultBackground();

    private EmbeddingAnimationBackground() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationBackground$ColorBackground;", "Landroidx/window/embedding/EmbeddingAnimationBackground;", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getColor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ColorBackground extends androidx.window.embedding.EmbeddingAnimationBackground {
        private final int color;

        public final int getColor() {
            return this.color;
        }

        public ColorBackground(int i) {
            super(null);
            this.color = i;
            if (android.graphics.Color.alpha(i) != 255) {
                throw new java.lang.IllegalArgumentException("Background color must be opaque".toString());
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorBackground{color:");
            sb.append(java.lang.Integer.toHexString(this.color));
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof androidx.window.embedding.EmbeddingAnimationBackground.ColorBackground) && this.color == ((androidx.window.embedding.EmbeddingAnimationBackground.ColorBackground) other).color;
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.color);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationBackground$DefaultBackground;", "Landroidx/window/embedding/EmbeddingAnimationBackground;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DefaultBackground extends androidx.window.embedding.EmbeddingAnimationBackground {
        public DefaultBackground() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DefaultBackground";
        }

        public final int hashCode() {
            return toString().hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/window/embedding/EmbeddingAnimationBackground$Companion;", "", "<init>", "()V", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/window/embedding/EmbeddingAnimationBackground$ColorBackground;", "createColorBackground", "(I)Landroidx/window/embedding/EmbeddingAnimationBackground$ColorBackground;", "Landroidx/window/embedding/EmbeddingAnimationBackground;", "buildFromValue$window_release", "(I)Landroidx/window/embedding/EmbeddingAnimationBackground;", "DEFAULT", "Landroidx/window/embedding/EmbeddingAnimationBackground;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.EmbeddingAnimationBackground.ColorBackground createColorBackground(int color) {
            return new androidx.window.embedding.EmbeddingAnimationBackground.ColorBackground(color);
        }

        public final androidx.window.embedding.EmbeddingAnimationBackground buildFromValue$window_release(int color) {
            if (android.graphics.Color.alpha(color) != 255) {
                return androidx.window.embedding.EmbeddingAnimationBackground.DEFAULT;
            }
            return createColorBackground(color);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.EmbeddingAnimationBackground.ColorBackground createColorBackground(int i) {
        return INSTANCE.createColorBackground(i);
    }

    public /* synthetic */ EmbeddingAnimationBackground(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
