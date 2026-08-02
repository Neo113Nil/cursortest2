package Id0;

import Jd0.b;
import Sc.o;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import zd0.c;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f12271a;

    /* renamed from: b, reason: collision with root package name */
    private NotificationBar f12272b;

    /* loaded from: classes3.dex */
    public static final class a implements NotificationBar.Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Gd0.a f12273a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f12274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd0.c f12275c;

        a(Gd0.a aVar, g gVar, zd0.c cVar) {
            this.f12273a = aVar;
            this.f12274b = gVar;
            this.f12275c = cVar;
        }

        @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
        public final void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason reason) {
            LinkedHashMap linkedHashMap;
            c.a aVar;
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Gd0.a aVar2 = this.f12273a;
            Map<String, TokenizedTrackingInfo> trackingInfo = aVar2.a().getTrackingInfo();
            if (trackingInfo != null) {
                linkedHashMap = new LinkedHashMap(U.h(trackingInfo.size()));
                Iterator<T> it = trackingInfo.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), Jd0.b.a((TokenizedTrackingInfo) entry.getValue()));
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                Intrinsics.checkNotNullParameter(reason, "<this>");
                int i11 = b.a.f14621a[reason.ordinal()];
                if (i11 == 1) {
                    aVar = c.a.SWIPE;
                } else if (i11 == 2) {
                    aVar = c.a.ACTION;
                } else if (i11 == 3) {
                    aVar = c.a.TIMEOUT;
                } else if (i11 == 4) {
                    aVar = c.a.MANUAL;
                } else {
                    if (i11 != 5) {
                        throw new o();
                    }
                    aVar = c.a.CONSECUTIVE;
                }
                this.f12275c.onDismiss(aVar, linkedHashMap);
            }
            this.f12274b.f12271a.a(reason, aVar2);
        }

        @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
        public final void onShown(NotificationBar notificationBar) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            Gd0.a aVar = this.f12273a;
            Map<String, TokenizedTrackingInfo> trackingInfo = aVar.a().getTrackingInfo();
            if (trackingInfo != null) {
                linkedHashMap = new LinkedHashMap(U.h(trackingInfo.size()));
                Iterator<T> it = trackingInfo.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), Jd0.b.a((TokenizedTrackingInfo) entry.getValue()));
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                this.f12275c.onShow(linkedHashMap);
            }
            this.f12274b.f12271a.b(aVar);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd0.c f12276b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Gd0.a f12277c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zd0.c cVar, Gd0.a aVar) {
            super(1);
            this.f12276b = cVar;
            this.f12277c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            LinkedHashMap linkedHashMap;
            AtomAction action = atomAction;
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof AtomAction.Move) {
                AtomAction.Move move = (AtomAction.Move) action;
                String link = move.getLink();
                if (link != null) {
                    String id2 = move.getId();
                    Map<String, TokenizedTrackingInfo> trackingInfo = this.f12277c.a().getTrackingInfo();
                    if (trackingInfo != null) {
                        linkedHashMap = new LinkedHashMap(U.h(trackingInfo.size()));
                        Iterator<T> it = trackingInfo.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            linkedHashMap.put(entry.getKey(), Jd0.b.a((TokenizedTrackingInfo) entry.getValue()));
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    this.f12276b.onClick(new c.b(id2, link, linkedHashMap));
                }
            } else {
                Jd0.a.f14618a.d("Unsupported action. In current version supported only redirect version");
            }
            return Unit.f71690a;
        }
    }

    public g(@NotNull e notificationBarSdkListener) {
        Intrinsics.checkNotNullParameter(notificationBarSdkListener, "notificationBarSdkListener");
        this.f12271a = notificationBarSdkListener;
    }

    public final void b() {
        NotificationBar notificationBar = this.f12272b;
        if (notificationBar != null) {
            notificationBar.dismiss();
        }
        this.f12272b = null;
    }

    public final void c(@NotNull ViewGroup container, @NotNull J lifecycleOwner, @NotNull Gd0.a inAppPushEntity, @NotNull zd0.c inAppPushListener) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(inAppPushEntity, "inAppPushEntity");
        Intrinsics.checkNotNullParameter(inAppPushListener, "inAppPushListener");
        if (inAppPushEntity.a() == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(container, null, 1, null);
        Intrinsics.f(asNotificationLayoutManager$default);
        NotificationBar make = companion.make(asNotificationLayoutManager$default, inAppPushEntity.a(), lifecycleOwner, new b(inAppPushListener, inAppPushEntity));
        make.addCallback(new a(inAppPushEntity, this, inAppPushListener));
        this.f12272b = make;
        make.show();
    }
}
