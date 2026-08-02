package org.betup.ui.fragment.home.compose;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.analytics.HomeMatchAd;
import org.betup.ui.fragment.home.adapter.HomeMatchAdAdapter;
import org.betup.ui.fragment.home.adapter.HomeMatchAdPagesAdapter;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeMatchAdsRow.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a9\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"dp", "", "ctx", "Landroid/content/Context;", "dps", "HomeMatchAdsRow", "", "ads", "", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "onAdClickTracking", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchAdsRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchAdsRow$lambda$9(List list, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeMatchAdsRow(list, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final int dp(Context context, int i) {
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static final void HomeMatchAdsRow(final List<HomeMatchAd> ads, final Function1<? super String, Unit> onAdClickTracking, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(onAdClickTracking, "onAdClickTracking");
        Composer startRestartGroup = composer.startRestartGroup(-171866511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(ads) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onAdClickTracking) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-171866511, i3, -1, "org.betup.ui.fragment.home.compose.HomeMatchAdsRow (HomeMatchAdsRow.kt:31)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeMatchAdsRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LinearLayout HomeMatchAdsRow$lambda$5$lambda$4;
                        HomeMatchAdsRow$lambda$5$lambda$4 = HomeMatchAdsRowKt.HomeMatchAdsRow$lambda$5$lambda$4((Context) obj);
                        return HomeMatchAdsRow$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changedInstance = startRestartGroup.changedInstance(ads) | ((i3 & 112) == 32);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeMatchAdsRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HomeMatchAdsRow$lambda$8$lambda$7;
                        HomeMatchAdsRow$lambda$8$lambda$7 = HomeMatchAdsRowKt.HomeMatchAdsRow$lambda$8$lambda$7(ads, onAdClickTracking, (LinearLayout) obj);
                        return HomeMatchAdsRow$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, startRestartGroup, ((i3 >> 3) & 112) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.HomeMatchAdsRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchAdsRow$lambda$9;
                    HomeMatchAdsRow$lambda$9 = HomeMatchAdsRowKt.HomeMatchAdsRow$lambda$9(ads, onAdClickTracking, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchAdsRow$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout HomeMatchAdsRow$lambda$5$lambda$4(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        LinearLayout linearLayout = new LinearLayout(ctx);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, dp(ctx, 4), 0, dp(ctx, 4));
        final RecyclerView recyclerView = new RecyclerView(ctx);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, dp(ctx, 180)));
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(ctx, 0, false));
        final RecyclerView recyclerView2 = new RecyclerView(ctx);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = dp(ctx, 8);
        layoutParams.gravity = 1;
        recyclerView2.setLayoutParams(layoutParams);
        recyclerView2.setOverScrollMode(2);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(ctx, 0, false));
        final LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.betup.ui.fragment.home.compose.HomeMatchAdsRowKt$HomeMatchAdsRow$1$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView3, int newState) {
                View findSnapView;
                Intrinsics.checkNotNullParameter(recyclerView3, "recyclerView");
                super.onScrollStateChanged(recyclerView3, newState);
                if (newState == 0) {
                    RecyclerView.LayoutManager layoutManager = RecyclerView.this.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null || (findSnapView = linearSnapHelper.findSnapView(linearLayoutManager)) == null) {
                        return;
                    }
                    int position = linearLayoutManager.getPosition(findSnapView);
                    RecyclerView.Adapter adapter = recyclerView2.getAdapter();
                    HomeMatchAdPagesAdapter homeMatchAdPagesAdapter = adapter instanceof HomeMatchAdPagesAdapter ? (HomeMatchAdPagesAdapter) adapter : null;
                    if (homeMatchAdPagesAdapter != null) {
                        homeMatchAdPagesAdapter.changeCurrentPage(position);
                    }
                }
            }
        });
        linearLayout.addView(recyclerView);
        linearLayout.addView(recyclerView2);
        linearLayout.setTag(new HomeAdsRecyclerHost(recyclerView, recyclerView2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchAdsRow$lambda$8$lambda$7(List list, Function1 function1, LinearLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Object tag = container.getTag();
        HomeAdsRecyclerHost homeAdsRecyclerHost = tag instanceof HomeAdsRecyclerHost ? (HomeAdsRecyclerHost) tag : null;
        if (homeAdsRecyclerHost == null) {
            return Unit.INSTANCE;
        }
        if (list.isEmpty()) {
            container.setVisibility(8);
            homeAdsRecyclerHost.getMainRv().setAdapter(null);
            homeAdsRecyclerHost.getDotsRv().setAdapter(null);
            return Unit.INSTANCE;
        }
        container.setVisibility(0);
        homeAdsRecyclerHost.getMainRv().setAdapter(new HomeMatchAdAdapter(homeAdsRecyclerHost.getDotsRv(), CollectionsKt.toMutableList((Collection) list), function1));
        RecyclerView dotsRv = homeAdsRecyclerHost.getDotsRv();
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(false);
        }
        dotsRv.setAdapter(new HomeMatchAdPagesAdapter(arrayList, 0));
        return Unit.INSTANCE;
    }
}
