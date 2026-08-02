package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Landroidx/compose/ui/text/BulletSpanWithLevel;", "", "Landroidx/compose/ui/text/Bullet;", "bullet", "", "indentationLevel", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(Landroidx/compose/ui/text/Bullet;II)V", "component1", "()Landroidx/compose/ui/text/Bullet;", "component2", "()I", "component3", "copy", "(Landroidx/compose/ui/text/Bullet;II)Landroidx/compose/ui/text/BulletSpanWithLevel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/Bullet;", "getBullet", com.visa.cbp.getEncExpo.warmup, "getIndentationLevel", "getStart"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BulletSpanWithLevel {
    public static final int $stable = androidx.compose.ui.graphics.drawscope.DrawStyle.$stable;
    private final androidx.compose.ui.text.Bullet bullet;
    private final int indentationLevel;
    private final int start;

    public BulletSpanWithLevel(androidx.compose.ui.text.Bullet bullet, int i, int i2) {
        this.bullet = bullet;
        this.indentationLevel = i;
        this.start = i2;
    }

    public final androidx.compose.ui.text.Bullet getBullet() {
        return this.bullet;
    }

    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    public final int getStart() {
        return this.start;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.bullet);
        sb.append(", indentationLevel=");
        sb.append(this.indentationLevel);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.bullet.hashCode() * 31) + java.lang.Integer.hashCode(this.indentationLevel)) * 31) + java.lang.Integer.hashCode(this.start);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.BulletSpanWithLevel)) {
            return false;
        }
        androidx.compose.ui.text.BulletSpanWithLevel bulletSpanWithLevel = (androidx.compose.ui.text.BulletSpanWithLevel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    public final androidx.compose.ui.text.BulletSpanWithLevel copy(androidx.compose.ui.text.Bullet bullet, int indentationLevel, int start) {
        return new androidx.compose.ui.text.BulletSpanWithLevel(bullet, indentationLevel, start);
    }

    /* renamed from: component3, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.text.Bullet getBullet() {
        return this.bullet;
    }

    public static /* synthetic */ androidx.compose.ui.text.BulletSpanWithLevel copy$default(androidx.compose.ui.text.BulletSpanWithLevel bulletSpanWithLevel, androidx.compose.ui.text.Bullet bullet, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i3 & 2) != 0) {
            i = bulletSpanWithLevel.indentationLevel;
        }
        if ((i3 & 4) != 0) {
            i2 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.copy(bullet, i, i2);
    }
}
