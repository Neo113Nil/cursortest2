package androidx.glance.appwidget;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.Applier;
import androidx.glance.appwidget.SizeMode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"ForEachSize", "", "sizeMode", "Landroidx/glance/appwidget/SizeMode;", "minSize", "Landroidx/compose/ui/unit/DpSize;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ForEachSize-eVKgIn8", "(Landroidx/glance/appwidget/SizeMode;JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SizeBox", "size", "SizeBox-IbIYxLY", "(JLandroidx/glance/appwidget/SizeMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSizeBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SizeBox.kt\nandroidx/glance/appwidget/SizeBoxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n76#2:118\n76#2:126\n76#2:128\n36#3:119\n1057#4,6:120\n1#5:127\n1549#6:129\n1620#6,3:130\n1549#6:133\n1620#6,3:134\n*S KotlinDebug\n*F\n+ 1 SizeBox.kt\nandroidx/glance/appwidget/SizeBoxKt\n*L\n99#1:118\n101#1:126\n108#1:128\n99#1:119\n99#1:120,6\n109#1:129\n109#1:130,3\n113#1:133\n113#1:134,3\n*E\n"})
/* loaded from: classes.dex */
public final class SizeBoxKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: ForEachSize-eVKgIn8, reason: not valid java name */
    public static final void m1317ForEachSizeeVKgIn8(final SizeMode sizeMode, final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int collectionSizeOrDefault;
        Set<DpSize> set;
        int collectionSizeOrDefault2;
        Composer startRestartGroup = composer.startRestartGroup(1526030150);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(sizeMode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            function22 = function2;
            i2 |= startRestartGroup.changed(function22) ? 256 : 128;
        } else {
            function22 = function2;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1526030150, i2, -1, "androidx.glance.appwidget.ForEachSize (SizeBox.kt:90)");
            }
            if (sizeMode instanceof SizeMode.Single) {
                startRestartGroup.startReplaceableGroup(1209069742);
                startRestartGroup.endReplaceableGroup();
                set = CollectionsKt.listOf(DpSize.m1107boximpl(j));
            } else if (sizeMode instanceof SizeMode.Exact) {
                startRestartGroup.startReplaceableGroup(1209069787);
                if (Build.VERSION.SDK_INT >= 31) {
                    startRestartGroup.startReplaceableGroup(1209069839);
                    Bundle bundle = (Bundle) startRestartGroup.consume(CompositionLocalsKt.getLocalAppWidgetOptions());
                    DpSize m1107boximpl = DpSize.m1107boximpl(j);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(m1107boximpl);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0<DpSize>() { // from class: androidx.glance.appwidget.SizeBoxKt$ForEachSize$sizes$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ DpSize invoke() {
                                return DpSize.m1107boximpl(m1319invokeMYxV2XQ());
                            }

                            /* renamed from: invoke-MYxV2XQ, reason: not valid java name */
                            public final long m1319invokeMYxV2XQ() {
                                return j;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    set = AppWidgetUtilsKt.extractAllSizes(bundle, (Function0) rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(1209069926);
                    set = AppWidgetUtilsKt.extractOrientationSizes((Bundle) startRestartGroup.consume(CompositionLocalsKt.getLocalAppWidgetOptions()));
                    if (set.isEmpty()) {
                        set = CollectionsKt.listOf(DpSize.m1107boximpl(j));
                    }
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
            } else {
                if (!(sizeMode instanceof SizeMode.Responsive)) {
                    startRestartGroup.startReplaceableGroup(1209066450);
                    startRestartGroup.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceableGroup(1209070085);
                if (Build.VERSION.SDK_INT >= 31) {
                    set = ((SizeMode.Responsive) sizeMode).getSizes();
                } else {
                    SizeMode.Responsive responsive = (SizeMode.Responsive) sizeMode;
                    long packedValue = AppWidgetUtilsKt.sortedBySize(responsive.getSizes()).get(0).getPackedValue();
                    List<DpSize> extractOrientationSizes = AppWidgetUtilsKt.extractOrientationSizes((Bundle) startRestartGroup.consume(CompositionLocalsKt.getLocalAppWidgetOptions()));
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(extractOrientationSizes, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator<T> it = extractOrientationSizes.iterator();
                    while (it.hasNext()) {
                        DpSize m1283findBestSizeitqla9I = AppWidgetUtilsKt.m1283findBestSizeitqla9I(((DpSize) it.next()).getPackedValue(), responsive.getSizes());
                        arrayList.add(DpSize.m1107boximpl(m1283findBestSizeitqla9I != null ? m1283findBestSizeitqla9I.getPackedValue() : packedValue));
                    }
                    boolean isEmpty = arrayList.isEmpty();
                    Collection collection = arrayList;
                    if (isEmpty) {
                        collection = CollectionsKt.listOf((Object[]) new DpSize[]{DpSize.m1107boximpl(packedValue), DpSize.m1107boximpl(packedValue)});
                    }
                    set = collection;
                }
                startRestartGroup.endReplaceableGroup();
            }
            List distinct = CollectionsKt.distinct(set);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(distinct, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator it2 = distinct.iterator();
            while (it2.hasNext()) {
                m1318SizeBoxIbIYxLY(((DpSize) it2.next()).getPackedValue(), sizeMode, function22, startRestartGroup, ((i2 << 3) & 112) | (i2 & 896));
                arrayList2.add(Unit.INSTANCE);
                function22 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$ForEachSize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                SizeBoxKt.m1317ForEachSizeeVKgIn8(SizeMode.this, j, function2, composer2, i | 1);
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: SizeBox-IbIYxLY, reason: not valid java name */
    public static final void m1318SizeBoxIbIYxLY(final long j, final SizeMode sizeMode, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-53921383);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(sizeMode) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        final int i3 = i2;
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53921383, i3, -1, "androidx.glance.appwidget.SizeBox (SizeBox.kt:68)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{androidx.glance.CompositionLocalsKt.getLocalSize().provides(DpSize.m1107boximpl(j))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1209815847, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$1

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$1, reason: invalid class name */
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<EmittableSizeBox> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(0, EmittableSizeBox.class, "<init>", "<init>()V", 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final EmittableSizeBox invoke() {
                        return new EmittableSizeBox();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1209815847, i4, -1, "androidx.glance.appwidget.SizeBox.<anonymous> (SizeBox.kt:73)");
                    }
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                    long j2 = j;
                    SizeMode sizeMode2 = sizeMode;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i5 = i3;
                    composer2.startReplaceableGroup(578571862);
                    int i6 = i5 & 896;
                    composer2.startReplaceableGroup(-548224868);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(anonymousClass1);
                    } else {
                        composer2.useNode();
                    }
                    Composer m108constructorimpl = Updater.m108constructorimpl(composer2);
                    Updater.m115setimpl(m108constructorimpl, DpSize.m1107boximpl(j2), new Function2<EmittableSizeBox, DpSize, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableSizeBox emittableSizeBox, DpSize dpSize) {
                            m1320invoke6HolHcs(emittableSizeBox, dpSize.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-6HolHcs, reason: not valid java name */
                        public final void m1320invoke6HolHcs(EmittableSizeBox emittableSizeBox, long j3) {
                            emittableSizeBox.m1306setSizeEaSLcWc(j3);
                        }
                    });
                    Updater.m115setimpl(m108constructorimpl, sizeMode2, new Function2<EmittableSizeBox, SizeMode, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(EmittableSizeBox emittableSizeBox, SizeMode sizeMode3) {
                            invoke2(emittableSizeBox, sizeMode3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(EmittableSizeBox emittableSizeBox, SizeMode sizeMode3) {
                            emittableSizeBox.setSizeMode(sizeMode3);
                        }
                    });
                    function22.invoke(composer2, Integer.valueOf((i6 >> 6) & 14));
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                SizeBoxKt.m1318SizeBoxIbIYxLY(j, sizeMode, function2, composer2, i | 1);
            }
        });
    }
}
