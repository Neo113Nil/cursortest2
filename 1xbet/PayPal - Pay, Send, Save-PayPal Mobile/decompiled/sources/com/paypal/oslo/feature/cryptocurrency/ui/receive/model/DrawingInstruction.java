package com.paypal.oslo.feature.cryptocurrency.ui.receive.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "", "<init>", "()V", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, "DataModule", "PositionMarker", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DrawingInstruction {
    public static final int $stable = 0;

    private DrawingInstruction() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "width", "height", "<init>", "(JFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2", "()F", "component3", "copy-ek8zF_U", "(JFF)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$Background;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getColor-0d7_KjU", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWidth", "getHeight"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Background extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction {
        public static final int $stable = 0;
        private final long color;
        private final float height;
        private final float width;

        private Background(long j, float f, float f2) {
            super(null);
            this.color = j;
            this.width = f;
            this.height = f2;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m13997getColor0d7_KjU() {
            return this.color;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getHeight() {
            return this.height;
        }

        public final java.lang.String toString() {
            java.lang.String m6004toStringimpl = androidx.compose.ui.graphics.Color.m6004toStringimpl(this.color);
            float f = this.width;
            float f2 = this.height;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Background(color=");
            sb.append(m6004toStringimpl);
            sb.append(", width=");
            sb.append(f);
            sb.append(", height=");
            sb.append(f2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.color) * 31) + java.lang.Float.hashCode(this.width)) * 31) + java.lang.Float.hashCode(this.height);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background background = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background) other;
            return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, background.color) && java.lang.Float.compare(this.width, background.width) == 0 && java.lang.Float.compare(this.height, background.height) == 0;
        }

        /* renamed from: copy-ek8zF_U, reason: not valid java name */
        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background m13996copyek8zF_U(long color, float width, float height) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background(color, width, height, null);
        }

        /* renamed from: component3, reason: from getter */
        public final float getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: copy-ek8zF_U$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background m13994copyek8zF_U$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.Background background, long j, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = background.color;
            }
            if ((i & 2) != 0) {
                f = background.width;
            }
            if ((i & 4) != 0) {
                f2 = background.height;
            }
            return background.m13996copyek8zF_U(j, f, f2);
        }

        public /* synthetic */ Background(long j, float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "", "centerX", "centerY", "radius", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "<init>", "(FFFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2", "component3", "component4-0d7_KjU", "()J", "component4", "copy-g2O1Hgs", "(FFFJ)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$DataModule;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCenterX", "getCenterY", "getRadius", "J", "getColor-0d7_KjU"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataModule extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction {
        public static final int $stable = 0;
        private final float centerX;
        private final float centerY;
        private final long color;
        private final float radius;

        private DataModule(float f, float f2, float f3, long j) {
            super(null);
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
            this.color = j;
        }

        public final float getCenterX() {
            return this.centerX;
        }

        public final float getCenterY() {
            return this.centerY;
        }

        public final float getRadius() {
            return this.radius;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m14001getColor0d7_KjU() {
            return this.color;
        }

        public final java.lang.String toString() {
            float f = this.centerX;
            float f2 = this.centerY;
            float f3 = this.radius;
            java.lang.String m6004toStringimpl = androidx.compose.ui.graphics.Color.m6004toStringimpl(this.color);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataModule(centerX=");
            sb.append(f);
            sb.append(", centerY=");
            sb.append(f2);
            sb.append(", radius=");
            sb.append(f3);
            sb.append(", color=");
            sb.append(m6004toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.centerX) * 31) + java.lang.Float.hashCode(this.centerY)) * 31) + java.lang.Float.hashCode(this.radius)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.color);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule dataModule = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule) other;
            return java.lang.Float.compare(this.centerX, dataModule.centerX) == 0 && java.lang.Float.compare(this.centerY, dataModule.centerY) == 0 && java.lang.Float.compare(this.radius, dataModule.radius) == 0 && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, dataModule.color);
        }

        /* renamed from: copy-g2O1Hgs, reason: not valid java name */
        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule m14000copyg2O1Hgs(float centerX, float centerY, float radius, long color) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule(centerX, centerY, radius, color, null);
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* renamed from: component2, reason: from getter */
        public final float getCenterY() {
            return this.centerY;
        }

        /* renamed from: component1, reason: from getter */
        public final float getCenterX() {
            return this.centerX;
        }

        /* renamed from: copy-g2O1Hgs$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule m13998copyg2O1Hgs$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.DataModule dataModule, float f, float f2, float f3, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = dataModule.centerX;
            }
            if ((i & 2) != 0) {
                f2 = dataModule.centerY;
            }
            float f4 = f2;
            if ((i & 4) != 0) {
                f3 = dataModule.radius;
            }
            float f5 = f3;
            if ((i & 8) != 0) {
                j = dataModule.color;
            }
            return dataModule.m14000copyg2O1Hgs(f, f4, f5, j);
        }

        public /* synthetic */ DataModule(float f, float f2, float f3, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, f3, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction;", "", "x", "y", "markerSize", "moduleSize", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "roundedCorner", "<init>", "(FFFFLcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;)V", "component1", "()F", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "copy", "(FFFFLcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/DrawingInstruction$PositionMarker;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX", "getY", "getMarkerSize", "getModuleSize", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/PositionMarkerCorner;", "getRoundedCorner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PositionMarker extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction {
        public static final int $stable = 0;
        private final float markerSize;
        private final float moduleSize;
        private final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner roundedCorner;
        private final float x;
        private final float y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PositionMarker(float f, float f2, float f3, float f4, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positionMarkerCorner, "");
            this.x = f;
            this.y = f2;
            this.markerSize = f3;
            this.moduleSize = f4;
            this.roundedCorner = positionMarkerCorner;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final float getMarkerSize() {
            return this.markerSize;
        }

        public final float getModuleSize() {
            return this.moduleSize;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner getRoundedCorner() {
            return this.roundedCorner;
        }

        public final java.lang.String toString() {
            float f = this.x;
            float f2 = this.y;
            float f3 = this.markerSize;
            float f4 = this.moduleSize;
            com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner = this.roundedCorner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PositionMarker(x=");
            sb.append(f);
            sb.append(", y=");
            sb.append(f2);
            sb.append(", markerSize=");
            sb.append(f3);
            sb.append(", moduleSize=");
            sb.append(f4);
            sb.append(", roundedCorner=");
            sb.append(positionMarkerCorner);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Float.hashCode(this.x) * 31) + java.lang.Float.hashCode(this.y)) * 31) + java.lang.Float.hashCode(this.markerSize)) * 31) + java.lang.Float.hashCode(this.moduleSize)) * 31) + this.roundedCorner.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker positionMarker = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker) other;
            return java.lang.Float.compare(this.x, positionMarker.x) == 0 && java.lang.Float.compare(this.y, positionMarker.y) == 0 && java.lang.Float.compare(this.markerSize, positionMarker.markerSize) == 0 && java.lang.Float.compare(this.moduleSize, positionMarker.moduleSize) == 0 && this.roundedCorner == positionMarker.roundedCorner;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker copy(float x, float y, float markerSize, float moduleSize, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner roundedCorner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roundedCorner, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker(x, y, markerSize, moduleSize, roundedCorner);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner getRoundedCorner() {
            return this.roundedCorner;
        }

        /* renamed from: component4, reason: from getter */
        public final float getModuleSize() {
            return this.moduleSize;
        }

        /* renamed from: component3, reason: from getter */
        public final float getMarkerSize() {
            return this.markerSize;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.DrawingInstruction.PositionMarker positionMarker, float f, float f2, float f3, float f4, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.PositionMarkerCorner positionMarkerCorner, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = positionMarker.x;
            }
            if ((i & 2) != 0) {
                f2 = positionMarker.y;
            }
            float f5 = f2;
            if ((i & 4) != 0) {
                f3 = positionMarker.markerSize;
            }
            float f6 = f3;
            if ((i & 8) != 0) {
                f4 = positionMarker.moduleSize;
            }
            float f7 = f4;
            if ((i & 16) != 0) {
                positionMarkerCorner = positionMarker.roundedCorner;
            }
            return positionMarker.copy(f, f5, f6, f7, positionMarkerCorner);
        }
    }

    public /* synthetic */ DrawingInstruction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
