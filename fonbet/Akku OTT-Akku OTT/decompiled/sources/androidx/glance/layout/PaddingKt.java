package androidx.glance.layout;

import android.content.res.Resources;
import androidx.annotation.DimenRes;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010\u0002\u001a\u00020\t2\b\b\u0003\u0010\u0004\u001a\u00020\t2\b\b\u0003\u0010\u0005\u001a\u00020\t2\b\b\u0003\u0010\u0006\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0001H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u001f\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\b\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0011\u001a\u00020\t\u001a\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0015\u001a\u00020\t\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010\u0018\u001a\u00020\t2\b\b\u0003\u0010\u0004\u001a\u00020\t2\b\b\u0003\u0010\u0019\u001a\u00020\t2\b\b\u0003\u0010\u0006\u001a\u00020\t\u001a\"\u0010\u001b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\t0\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0001¢\u0006\u0002\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a\f\u0010\u001e\u001a\u00020\u001f*\u00020\tH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"absolutePadding", "Landroidx/glance/GlanceModifier;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "absolutePadding-qDBjuR0", "(Landroidx/glance/GlanceModifier;FFFF)Landroidx/glance/GlanceModifier;", "", "collectPadding", "Landroidx/glance/layout/PaddingModifier;", "collectPaddingInDp", "Landroidx/glance/layout/PaddingInDp;", "resources", "Landroid/content/res/Resources;", "padding", "all", "padding-3ABfNKs", "(Landroidx/glance/GlanceModifier;F)Landroidx/glance/GlanceModifier;", "horizontal", "vertical", "padding-VpY3zN4", "(Landroidx/glance/GlanceModifier;FF)Landroidx/glance/GlanceModifier;", "start", "end", "padding-qDBjuR0", "toDp", "", "(Ljava/util/List;Landroid/content/res/Resources;)F", "toPadding", "Landroidx/glance/layout/PaddingDimension;", "toPadding-0680j_4", "(F)Landroidx/glance/layout/PaddingDimension;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/glance/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,281:1\n155#2:282\n155#2:283\n155#2:284\n155#2:285\n155#2:286\n155#2:287\n155#2:288\n155#2:289\n155#2:290\n155#2:291\n155#2:292\n175#2:295\n1789#3,2:293\n1791#3:297\n52#4:296\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/glance/layout/PaddingKt\n*L\n35#1:282\n36#1:283\n37#1:284\n38#1:285\n79#1:286\n80#1:287\n144#1:288\n145#1:289\n146#1:290\n147#1:291\n198#1:292\n199#1:295\n198#1:293,2\n198#1:297\n199#1:296\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    public static final GlanceModifier absolutePadding(GlanceModifier glanceModifier, @DimenRes int i, @DimenRes int i2, @DimenRes int i3, @DimenRes int i4) {
        return glanceModifier.then(new PaddingModifier(toPadding(i), null, toPadding(i2), toPadding(i3), null, toPadding(i4), 18, null));
    }

    public static /* synthetic */ GlanceModifier absolutePadding$default(GlanceModifier glanceModifier, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return absolutePadding(glanceModifier, i, i2, i3, i4);
    }

    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final GlanceModifier m1428absolutePaddingqDBjuR0(GlanceModifier glanceModifier, float f, float f2, float f3, float f4) {
        return glanceModifier.then(new PaddingModifier(m1435toPadding0680j_4(f), null, m1435toPadding0680j_4(f2), m1435toPadding0680j_4(f3), null, m1435toPadding0680j_4(f4), 18, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m1429absolutePaddingqDBjuR0$default(GlanceModifier glanceModifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m1021constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m1021constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m1021constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m1021constructorimpl(0);
        }
        return m1428absolutePaddingqDBjuR0(glanceModifier, f, f2, f3, f4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final PaddingModifier collectPadding(GlanceModifier glanceModifier) {
        return (PaddingModifier) glanceModifier.foldIn(null, new Function2<PaddingModifier, GlanceModifier.Element, PaddingModifier>() { // from class: androidx.glance.layout.PaddingKt$collectPadding$1
            @Override // kotlin.jvm.functions.Function2
            public final PaddingModifier invoke(PaddingModifier paddingModifier, GlanceModifier.Element element) {
                if (!(element instanceof PaddingModifier)) {
                    return paddingModifier;
                }
                if (paddingModifier == null) {
                    paddingModifier = new PaddingModifier(null, null, null, null, null, null, 63, null);
                }
                return paddingModifier.plus((PaddingModifier) element);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final PaddingInDp collectPaddingInDp(GlanceModifier glanceModifier, Resources resources) {
        PaddingModifier collectPadding = collectPadding(glanceModifier);
        if (collectPadding != null) {
            return collectPadding.toDp(resources);
        }
        return null;
    }

    public static final GlanceModifier padding(GlanceModifier glanceModifier, @DimenRes int i, @DimenRes int i2, @DimenRes int i3, @DimenRes int i4) {
        return glanceModifier.then(new PaddingModifier(null, toPadding(i), toPadding(i2), null, toPadding(i3), toPadding(i4), 9, null));
    }

    public static /* synthetic */ GlanceModifier padding$default(GlanceModifier glanceModifier, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return padding(glanceModifier, i, i2, i3, i4);
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final GlanceModifier m1430padding3ABfNKs(GlanceModifier glanceModifier, float f) {
        PaddingDimension m1435toPadding0680j_4 = m1435toPadding0680j_4(f);
        return glanceModifier.then(new PaddingModifier(null, m1435toPadding0680j_4, m1435toPadding0680j_4, null, m1435toPadding0680j_4, m1435toPadding0680j_4, 9, null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final GlanceModifier m1431paddingVpY3zN4(GlanceModifier glanceModifier, float f, float f2) {
        return glanceModifier.then(new PaddingModifier(null, m1435toPadding0680j_4(f), m1435toPadding0680j_4(f2), null, m1435toPadding0680j_4(f), m1435toPadding0680j_4(f2), 9, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m1432paddingVpY3zN4$default(GlanceModifier glanceModifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m1021constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m1021constructorimpl(0);
        }
        return m1431paddingVpY3zN4(glanceModifier, f, f2);
    }

    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final GlanceModifier m1433paddingqDBjuR0(GlanceModifier glanceModifier, float f, float f2, float f3, float f4) {
        return glanceModifier.then(new PaddingModifier(null, m1435toPadding0680j_4(f), m1435toPadding0680j_4(f2), null, m1435toPadding0680j_4(f3), m1435toPadding0680j_4(f4), 9, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ GlanceModifier m1434paddingqDBjuR0$default(GlanceModifier glanceModifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m1021constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m1021constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m1021constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m1021constructorimpl(0);
        }
        return m1433paddingqDBjuR0(glanceModifier, f, f2, f3, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toDp(List<Integer> list, Resources resources) {
        float m1021constructorimpl = Dp.m1021constructorimpl(0);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m1021constructorimpl = Dp.m1021constructorimpl(Dp.m1021constructorimpl(resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density) + m1021constructorimpl);
        }
        return m1021constructorimpl;
    }

    private static final PaddingDimension toPadding(int i) {
        return i == 0 ? new PaddingDimension(0.0f, null, 3, null) : new PaddingDimension(i);
    }

    /* renamed from: toPadding-0680j_4, reason: not valid java name */
    private static final PaddingDimension m1435toPadding0680j_4(float f) {
        return new PaddingDimension(f, null, 2, null);
    }

    public static /* synthetic */ GlanceModifier padding$default(GlanceModifier glanceModifier, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return padding(glanceModifier, i, i2);
    }

    public static final GlanceModifier padding(GlanceModifier glanceModifier, @DimenRes int i, @DimenRes int i2) {
        return glanceModifier.then(new PaddingModifier(null, toPadding(i), toPadding(i2), null, toPadding(i), toPadding(i2), 9, null));
    }

    public static final GlanceModifier padding(GlanceModifier glanceModifier, @DimenRes int i) {
        PaddingDimension padding = toPadding(i);
        return glanceModifier.then(new PaddingModifier(null, padding, padding, null, padding, padding, 9, null));
    }
}
