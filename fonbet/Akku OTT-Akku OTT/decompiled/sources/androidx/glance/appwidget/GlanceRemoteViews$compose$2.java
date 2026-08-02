package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.DpSize;
import androidx.core.location.LocationRequestCompat;
import androidx.glance.Applier;
import androidx.glance.GlanceId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "Landroidx/glance/appwidget/RemoteViewsCompositionResult;", "<anonymous>", "(Lkotlinx/coroutines/K;)Landroidx/glance/appwidget/RemoteViewsCompositionResult;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.appwidget.GlanceRemoteViews$compose$2", f = "GlanceRemoteViews.kt", i = {0, 1, 1}, l = {85, LocationRequestCompat.QUALITY_LOW_POWER}, m = "invokeSuspend", n = {"$this$withContext", "layoutConfiguration", "root"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class GlanceRemoteViews$compose$2 extends SuspendLambda implements Function2<K, Continuation<? super RemoteViewsCompositionResult>, Object> {
    final /* synthetic */ Bundle $appWidgetOptions;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ Context $context;
    final /* synthetic */ long $size;
    final /* synthetic */ Object $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GlanceRemoteViews this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.glance.appwidget.GlanceRemoteViews$compose$2$2", f = "GlanceRemoteViews.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.glance.appwidget.GlanceRemoteViews$compose$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        final /* synthetic */ Recomposer $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Recomposer recomposer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$recomposer = recomposer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$recomposer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GlanceRemoteViews$compose$2(GlanceRemoteViews glanceRemoteViews, Context context, long j, Object obj, Bundle bundle, Function2<? super Composer, ? super Integer, Unit> function2, Continuation<? super GlanceRemoteViews$compose$2> continuation) {
        super(2, continuation);
        this.this$0 = glanceRemoteViews;
        this.$context = context;
        this.$size = j;
        this.$state = obj;
        this.$appWidgetOptions = bundle;
        this.$content = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlanceRemoteViews$compose$2 glanceRemoteViews$compose$2 = new GlanceRemoteViews$compose$2(this.this$0, this.$context, this.$size, this.$state, this.$appWidgetOptions, this.$content, continuation);
        glanceRemoteViews$compose$2.L$0 = obj;
        return glanceRemoteViews$compose$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r5 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        K k;
        Object initializeLayoutConfiguration;
        LayoutConfiguration layoutConfiguration;
        RemoteViewsRoot remoteViewsRoot;
        RemoteViews m1315translateCompositionKpG6l20;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            k = (K) this.L$0;
            GlanceRemoteViews glanceRemoteViews = this.this$0;
            Context context = this.$context;
            this.L$0 = k;
            this.label = 1;
            initializeLayoutConfiguration = glanceRemoteViews.initializeLayoutConfiguration(context, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RemoteViewsRoot remoteViewsRoot2 = (RemoteViewsRoot) this.L$1;
                LayoutConfiguration layoutConfiguration2 = (LayoutConfiguration) this.L$0;
                ResultKt.throwOnFailure(obj);
                remoteViewsRoot = remoteViewsRoot2;
                layoutConfiguration = layoutConfiguration2;
                NormalizeCompositionTreeKt.normalizeCompositionTree(remoteViewsRoot);
                m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(this.$context, 0, remoteViewsRoot, layoutConfiguration, layoutConfiguration.addLayout(remoteViewsRoot), this.$size, (r17 & 64) != 0 ? null : null);
                return new RemoteViewsCompositionResult(m1315translateCompositionKpG6l20);
            }
            k = (K) this.L$0;
            ResultKt.throwOnFailure(obj);
            initializeLayoutConfiguration = obj;
        }
        LayoutConfiguration layoutConfiguration3 = (LayoutConfiguration) initializeLayoutConfiguration;
        RemoteViewsRoot remoteViewsRoot3 = new RemoteViewsRoot(50);
        Applier applier = new Applier(remoteViewsRoot3);
        Recomposer recomposer = new Recomposer(k.getCoroutineContext());
        Composition Composition = CompositionKt.Composition(applier, recomposer);
        final Context context2 = this.$context;
        final Object obj2 = this.$state;
        final Bundle bundle = this.$appWidgetOptions;
        final long j = this.$size;
        final Function2<Composer, Integer, Unit> function2 = this.$content;
        Composition.setContent(ComposableLambdaKt.composableLambdaInstance(676741397, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.glance.appwidget.GlanceRemoteViews$compose$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(Composer composer, int i2) {
                GlanceRemoteViewsKt$REMOTE_VIEWS_ID$1 glanceRemoteViewsKt$REMOTE_VIEWS_ID$1;
                if ((i2 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(676741397, i2, -1, "androidx.glance.appwidget.GlanceRemoteViews.compose.<anonymous>.<anonymous> (GlanceRemoteViews.kt:90)");
                }
                ProvidedValue<Context> provides = androidx.glance.CompositionLocalsKt.getLocalContext().provides(context2);
                ProvidableCompositionLocal<GlanceId> localGlanceId = androidx.glance.CompositionLocalsKt.getLocalGlanceId();
                glanceRemoteViewsKt$REMOTE_VIEWS_ID$1 = GlanceRemoteViewsKt.REMOTE_VIEWS_ID;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{provides, localGlanceId.provides(glanceRemoteViewsKt$REMOTE_VIEWS_ID$1), androidx.glance.CompositionLocalsKt.getLocalState().provides(obj2), CompositionLocalsKt.getLocalAppWidgetOptions().provides(bundle), androidx.glance.CompositionLocalsKt.getLocalSize().provides(DpSize.m1107boximpl(j))}, function2, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        C1082i.c(k, null, null, new AnonymousClass2(recomposer, null), 3);
        recomposer.close();
        this.L$0 = layoutConfiguration3;
        this.L$1 = remoteViewsRoot3;
        this.label = 2;
        if (recomposer.join(this) != coroutine_suspended) {
            layoutConfiguration = layoutConfiguration3;
            remoteViewsRoot = remoteViewsRoot3;
            NormalizeCompositionTreeKt.normalizeCompositionTree(remoteViewsRoot);
            m1315translateCompositionKpG6l20 = RemoteViewsTranslatorKt.m1315translateCompositionKpG6l20(this.$context, 0, remoteViewsRoot, layoutConfiguration, layoutConfiguration.addLayout(remoteViewsRoot), this.$size, (r17 & 64) != 0 ? null : null);
            return new RemoteViewsCompositionResult(m1315translateCompositionKpG6l20);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super RemoteViewsCompositionResult> continuation) {
        return ((GlanceRemoteViews$compose$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
