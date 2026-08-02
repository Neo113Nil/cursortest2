package org.betup.utils.balance;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.user.UserService;
import org.betup.utils.balance.BalanceHolder;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BalanceHolder.kt */
@Singleton
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bJ\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J*\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lorg/betup/utils/balance/BalanceHolder;", "Lorg/betup/services/user/UserService$UserInfoListener;", "userService", "Lorg/betup/services/user/UserService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/user/UserService;)V", "mainHandler", "Landroid/os/Handler;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lorg/betup/utils/balance/BalanceHolder$BalanceUpdateListener;", "lastBalance", "", "getCurrentBalance", "postOptimisticBalance", "", "newBalance", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "onUserProfileUpdated", "message", "Lorg/betup/bus/UserProfileUpdatedMessage;", "onProfileFetched", "fullUserProfileModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "updated", "", "Lorg/betup/services/user/UserService$InfoKind;", "stat", "Lorg/betup/model/remote/api/FetchStat;", "notifyListeners", "balance", "BalanceUpdateListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BalanceHolder implements UserService.UserInfoListener {
    private static final String TAG = "BalanceHolder";
    private volatile long lastBalance;
    private final CopyOnWriteArrayList<WeakReference<BalanceUpdateListener>> listeners;
    private final Handler mainHandler;
    private final UserService userService;
    public static final int $stable = 8;

    /* compiled from: BalanceHolder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/betup/utils/balance/BalanceHolder$BalanceUpdateListener;", "", "onBalanceUpdated", "", "balance", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BalanceUpdateListener {
        void onBalanceUpdated(long balance);
    }

    @Inject
    public BalanceHolder(UserService userService) {
        UserProgressModel userProgressModel;
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.userService = userService;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.listeners = new CopyOnWriteArrayList<>();
        this.lastBalance = -1L;
        userService.subscribe(this, UserService.InfoKind.PROGRESS);
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        if (userService.isRegistered() && (userProgressModel = userService.getShortProfile().getUserProgressModel()) != null) {
            this.lastBalance = userProgressModel.getMoneyBalance();
        }
        Log.d(TAG, "BalanceHolder initialized and registered to EventBus");
    }

    /* renamed from: getCurrentBalance, reason: from getter */
    public final long getLastBalance() {
        return this.lastBalance;
    }

    public final void postOptimisticBalance(final long newBalance) {
        if (newBalance < 0) {
            return;
        }
        this.lastBalance = newBalance;
        this.mainHandler.post(new Runnable() { // from class: org.betup.utils.balance.BalanceHolder$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BalanceHolder.this.notifyListeners(newBalance);
            }
        });
    }

    public final void addListener(final BalanceUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(new WeakReference<>(listener));
        if (this.lastBalance >= 0) {
            this.mainHandler.post(new Runnable() { // from class: org.betup.utils.balance.BalanceHolder$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BalanceHolder.addListener$lambda$2(BalanceHolder.BalanceUpdateListener.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addListener$lambda$2(BalanceUpdateListener balanceUpdateListener, BalanceHolder balanceHolder) {
        balanceUpdateListener.onBalanceUpdated(balanceHolder.lastBalance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeListener$lambda$3(BalanceUpdateListener balanceUpdateListener, WeakReference weakReference) {
        return Intrinsics.areEqual(weakReference.get(), balanceUpdateListener);
    }

    public final void removeListener(final BalanceUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt.removeAll((List) this.listeners, new Function1() { // from class: org.betup.utils.balance.BalanceHolder$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean removeListener$lambda$3;
                removeListener$lambda$3 = BalanceHolder.removeListener$lambda$3(BalanceHolder.BalanceUpdateListener.this, (WeakReference) obj);
                return Boolean.valueOf(removeListener$lambda$3);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onUserProfileUpdated(UserProfileUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, "UserProfileUpdatedMessage received - refreshing balance");
        this.userService.invalidate(UserService.InfoKind.PROGRESS);
        this.userService.getProfile(this, UserService.InfoKind.PROGRESS);
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<? extends UserService.InfoKind> updated, FetchStat stat) {
        UserProgressModel userProgressModel;
        Intrinsics.checkNotNullParameter(stat, "stat");
        if (stat == FetchStat.SUCCESS) {
            if ((fullUserProfileModel != null ? fullUserProfileModel.getUserProgressModel() : null) == null || (userProgressModel = fullUserProfileModel.getUserProgressModel()) == null) {
                return;
            }
            final long moneyBalance = userProgressModel.getMoneyBalance();
            if (moneyBalance != this.lastBalance) {
                this.lastBalance = moneyBalance;
                this.mainHandler.post(new Runnable() { // from class: org.betup.utils.balance.BalanceHolder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BalanceHolder.this.notifyListeners(moneyBalance);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListeners(long balance) {
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<BalanceUpdateListener>> it = this.listeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<BalanceUpdateListener> next = it.next();
            BalanceUpdateListener balanceUpdateListener = next.get();
            if (balanceUpdateListener != null) {
                balanceUpdateListener.onBalanceUpdated(balance);
            } else {
                Intrinsics.checkNotNull(next);
                arrayList.add(next);
            }
        }
        this.listeners.removeAll(arrayList);
    }
}
