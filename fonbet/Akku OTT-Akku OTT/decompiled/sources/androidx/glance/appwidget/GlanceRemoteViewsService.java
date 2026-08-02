package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.glance.session.SessionManager;
import androidx.glance.session.SessionManagerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "Companion", "GlanceRemoteViewsFactory", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nGlanceRemoteViewsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceRemoteViewsService.kt\nandroidx/glance/appwidget/GlanceRemoteViewsService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceRemoteViewsService extends RemoteViewsService {
    public static final int $stable = 0;
    public static final String EXTRA_SIZE_INFO = "androidx.glance.widget.extra.size_info";
    public static final String EXTRA_VIEW_ID = "androidx.glance.widget.extra.view_id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RemoteCollectionItemsInMemoryStore InMemoryStore = new RemoteCollectionItemsInMemoryStore();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService$Companion;", "", "()V", "EXTRA_SIZE_INFO", "", "EXTRA_VIEW_ID", "InMemoryStore", "Landroidx/glance/appwidget/RemoteCollectionItemsInMemoryStore;", "getItems", "Landroidx/glance/appwidget/RemoteCollectionItems;", "appWidgetId", "", "viewId", "sizeInfo", "removeItems", "", "saveItems", "remoteCollectionItems", "saveItems$glance_appwidget_release", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RemoteCollectionItems getItems(int appWidgetId, int viewId, String sizeInfo) {
            RemoteCollectionItems items;
            synchronized (GlanceRemoteViewsService.InMemoryStore) {
                items = GlanceRemoteViewsService.InMemoryStore.getItems(appWidgetId, viewId, sizeInfo);
            }
            return items;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeItems(int appWidgetId, int viewId, String sizeInfo) {
            synchronized (GlanceRemoteViewsService.InMemoryStore) {
                GlanceRemoteViewsService.InMemoryStore.removeItems(appWidgetId, viewId, sizeInfo);
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void saveItems$glance_appwidget_release(int appWidgetId, int viewId, String sizeInfo, RemoteCollectionItems remoteCollectionItems) {
            synchronized (GlanceRemoteViewsService.InMemoryStore) {
                GlanceRemoteViewsService.InMemoryStore.save(appWidgetId, viewId, sizeInfo, remoteCollectionItems);
                Unit unit = Unit.INSTANCE;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0019\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService$GlanceRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "appWidgetId", "", "viewId", "size", "", "(Landroid/content/Context;IILjava/lang/String;)V", "getCount", "getItemId", "", "position", "getLoadingView", "", "getViewAt", "Landroid/widget/RemoteViews;", "getViewTypeCount", "hasStableIds", "", FirebaseAnalytics.Param.ITEMS, "Landroidx/glance/appwidget/RemoteCollectionItems;", "loadData", "", "onCreate", "onDataSetChanged", "onDestroy", "startSessionAndWaitUntilReady", "glanceId", "Landroidx/glance/appwidget/AppWidgetId;", "(Landroidx/glance/appwidget/AppWidgetId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGlanceRemoteViewsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceRemoteViewsService.kt\nandroidx/glance/appwidget/GlanceRemoteViewsService$GlanceRemoteViewsFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class GlanceRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
        private final int appWidgetId;
        private final Context context;
        private final String size;
        private final int viewId;

        public GlanceRemoteViewsFactory(Context context, int i, int i2, String str) {
            this.context = context;
            this.appWidgetId = i;
            this.viewId = i2;
            this.size = str;
        }

        private final RemoteCollectionItems items() {
            return GlanceRemoteViewsService.INSTANCE.getItems(this.appWidgetId, this.viewId, this.size);
        }

        private final void loadData() {
            C1082i.d(EmptyCoroutineContext.INSTANCE, new GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        
            if (r14.waitForReady(r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object startSessionAndWaitUntilReady(AppWidgetId appWidgetId, Continuation<? super Unit> continuation) {
            GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1;
            int i;
            AppWidgetSession appWidgetSession;
            if (continuation instanceof GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1) {
                glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 = (GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1) continuation;
                int i2 = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.context).getAppWidgetInfo(this.appWidgetId);
                        if ((appWidgetInfo != null ? appWidgetInfo.provider : null) == null) {
                            return Unit.INSTANCE;
                        }
                        Object newInstance = Class.forName(appWidgetInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver");
                        AppWidgetSession appWidgetSession2 = new AppWidgetSession(((GlanceAppWidgetReceiver) newInstance).getGlanceAppWidget(), appWidgetId, null, null, 12, null);
                        SessionManager glanceSessionManager = SessionManagerKt.getGlanceSessionManager();
                        Context context = this.context;
                        glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.L$0 = appWidgetSession2;
                        glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label = 1;
                        if (glanceSessionManager.startSession(context, appWidgetSession2, glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1) != coroutine_suspended) {
                            appWidgetSession = appWidgetSession2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    appWidgetSession = (AppWidgetSession) glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.L$0 = null;
                    glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label = 2;
                }
            }
            glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 = new GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1(this, continuation);
            Object obj2 = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label;
            if (i != 0) {
            }
            glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.L$0 = null;
            glanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1.label = 2;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getCount() {
            return items().getItemCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public long getItemId(int position) {
            try {
                return items().getItemId(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public Void getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public RemoteViews getViewAt(int position) {
            try {
                return items().getItemView(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.context.getPackageName(), R.layout.glance_invalid_list_item);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getViewTypeCount() {
            return items().get_viewTypeCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public boolean hasStableIds() {
            return items().getHasStableIds();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onCreate() {
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDataSetChanged() {
            loadData();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDestroy() {
            GlanceRemoteViewsService.INSTANCE.removeItems(this.appWidgetId, this.viewId, this.size);
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return (RemoteViews) getLoadingView();
        }
    }

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra(EXTRA_VIEW_ID, -1);
        if (intExtra2 == -1) {
            throw new IllegalStateException("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra(EXTRA_SIZE_INFO);
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalStateException("No size info was present in the intent");
        }
        return new GlanceRemoteViewsFactory(this, intExtra, intExtra2, stringExtra);
    }
}
