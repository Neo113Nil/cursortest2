package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutMeasureScope.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends androidx.compose.ui.layout.MeasureScope {
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    java.util.List<androidx.compose.ui.layout.Placeable> mo732measure0kLqBqw(int index, long constraints);

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    float mo310toDpGaN1DYA(long j);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    float mo311toDpu2uoSUM(float f);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    float mo312toDpu2uoSUM(int i);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    long mo313toDpSizekrfVVM(long j);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    long mo316toSizeXkaWNTQ(long j);

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    long mo317toSp0xMU5do(float f);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    long mo318toSpkPz2Gy4(float f);

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    long mo319toSpkPz2Gy4(int i);

    /* compiled from: LazyLayoutMeasureScope.kt */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$toDp-GaN1DYA, reason: not valid java name */
        public static float m733$default$toDpGaN1DYA(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope _this, long j) {
            if (!androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(j), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA())) {
                throw new java.lang.IllegalStateException("Only Sp can convert to Px".toString());
            }
            return androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.ui.unit.TextUnit.m4673getValueimpl(j) * _this.getFontScale());
        }

        /* renamed from: $default$toSize-XkaWNTQ, reason: not valid java name */
        public static long m737$default$toSizeXkaWNTQ(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope _this, long j) {
            if (j != androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ()) {
                return androidx.compose.ui.geometry.SizeKt.Size(_this.mo315toPx0680j_4(androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(j)), _this.mo315toPx0680j_4(androidx.compose.ui.unit.DpSize.m4574getHeightD9Ej5fM(j)));
            }
            return androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
        }

        /* renamed from: $default$toDpSize-k-rfVVM, reason: not valid java name */
        public static long m736$default$toDpSizekrfVVM(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope _this, long j) {
            if (j != androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
                return androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(_this.mo311toDpu2uoSUM(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)), _this.mo311toDpu2uoSUM(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j)));
            }
            return androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ();
        }
    }
}
