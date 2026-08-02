package org.betup.ui.dialogs.offer;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.viewbinding.ViewBinding;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.databinding.OfferTimerItemBinding;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.server.V7GetServerInfoInteractor;
import org.betup.model.remote.entity.server.ServerInfoModel;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.betup.utils.DateHelper;
import org.betup.utils.SupportedLanguagesManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@SerialName("Timer")
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002Z[B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u000202H\u0002J\u0010\u0010C\u001a\u00020>2\u0006\u0010B\u001a\u000202H\u0002J\u0010\u0010D\u001a\u0002022\u0006\u0010E\u001a\u000202H\u0002J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\u001d\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010N\u001a\u00020/2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\tHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001J%\u0010S\u001a\u00020>2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\bYR\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u000eR$\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010*\u001a\u0004\u0018\u00010)2\b\u0010(\u001a\u0004\u0018\u00010)8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010-R\u0018\u0010.\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b0\u0010\u000eR\u0018\u00101\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b3\u0010\u000eR\u0018\u00104\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b5\u0010\u000eR\u001a\u00106\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b8\u0010\u000eR\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\bJ\u0010\u000e¨\u0006\\"}, d2 = {"Lorg/betup/ui/dialogs/offer/TimerContent;", "Lorg/betup/ui/dialogs/offer/OfferItemContentImpl;", "id", "", "layoutParams", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLayoutParams$annotations", "getLayoutParams", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "viewLayoutId", "getViewLayoutId", "()I", "binding", "Lorg/betup/databinding/OfferTimerItemBinding;", "getBinding$annotations", "userService", "Lorg/betup/services/user/UserService;", "getUserService$annotations", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "serverInfoInteractor", "Lorg/betup/model/remote/api/rest/server/V7GetServerInfoInteractor;", "getServerInfoInteractor$annotations", "getServerInfoInteractor", "()Lorg/betup/model/remote/api/rest/server/V7GetServerInfoInteractor;", "setServerInfoInteractor", "(Lorg/betup/model/remote/api/rest/server/V7GetServerInfoInteractor;)V", "value", "Ljava/util/Timer;", "timer", "getTimer$annotations", "getTimer", "()Ljava/util/Timer;", "timerPaused", "", "getTimerPaused$annotations", "timestampCorrection", "", "getTimestampCorrection$annotations", "numberOfTicks", "getNumberOfTicks$annotations", "scaleAnimation", "Landroid/animation/ObjectAnimator;", "getScaleAnimation$annotations", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "context", "Landroid/content/Context;", "bind", "", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "initTimer", "expiresAt", "updateTimer", "getRemainingOfferTime", "offerFinishTimestamp", "onServerInfoFetched", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/server/ServerInfoModel;", "Ljava/lang/Void;", "getOnServerInfoFetched$annotations", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", VastTagName.COMPANION, "$serializer", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class TimerContent extends OfferItemContentImpl {
    private static final long TIMER_INTERVAL = 1000;
    private OfferTimerItemBinding binding;
    private final String id;
    private final OfferItemContent.LayoutParams layoutParams;
    private int numberOfTicks;
    private final BaseCachedSharedInteractor.OnFetchedListener<ServerInfoModel, Void> onServerInfoFetched;
    private ObjectAnimator scaleAnimation;

    @Inject
    public V7GetServerInfoInteractor serverInfoInteractor;
    private Timer timer;
    private boolean timerPaused;
    private long timestampCorrection;

    @Inject
    public UserService userService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ TimerContent copy$default(TimerContent timerContent, String str, OfferItemContent.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timerContent.id;
        }
        if ((i & 2) != 0) {
            layoutParams = timerContent.layoutParams;
        }
        return timerContent.copy(str, layoutParams);
    }

    @Transient
    private static /* synthetic */ void getBinding$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("layoutParams")
    public static /* synthetic */ void getLayoutParams$annotations() {
    }

    @Transient
    private static /* synthetic */ void getNumberOfTicks$annotations() {
    }

    @Transient
    private static /* synthetic */ void getOnServerInfoFetched$annotations() {
    }

    @Transient
    private static /* synthetic */ void getScaleAnimation$annotations() {
    }

    @Transient
    public static /* synthetic */ void getServerInfoInteractor$annotations() {
    }

    @Transient
    public static /* synthetic */ void getTimer$annotations() {
    }

    @Transient
    private static /* synthetic */ void getTimerPaused$annotations() {
    }

    @Transient
    private static /* synthetic */ void getTimestampCorrection$annotations() {
    }

    @Transient
    public static /* synthetic */ void getUserService$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final OfferItemContent.LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    public final TimerContent copy(String id, OfferItemContent.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        return new TimerContent(id, layoutParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerContent)) {
            return false;
        }
        TimerContent timerContent = (TimerContent) other;
        return Intrinsics.areEqual(this.id, timerContent.id) && Intrinsics.areEqual(this.layoutParams, timerContent.layoutParams);
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public int getViewLayoutId() {
        return R.layout.offer_timer_item;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.layoutParams.hashCode();
    }

    public String toString() {
        return "TimerContent(id=" + this.id + ", layoutParams=" + this.layoutParams + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimerContent(int i, String str, OfferItemContent.LayoutParams layoutParams, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TimerContent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.layoutParams = layoutParams;
        this.timer = null;
        this.timerPaused = false;
        this.timestampCorrection = 0L;
        this.numberOfTicks = 0;
        this.scaleAnimation = null;
        this.onServerInfoFetched = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.offer.TimerContent$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                TimerContent._init_$lambda$3(TimerContent.this, fetchedResponseMessage);
            }
        };
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(TimerContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, OfferItemContent$LayoutParams$$serializer.INSTANCE, self.getLayoutParams());
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public String getId() {
        return this.id;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public OfferItemContent.LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerContent(String id, OfferItemContent.LayoutParams layoutParams) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        this.id = id;
        this.layoutParams = layoutParams;
        this.onServerInfoFetched = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.offer.TimerContent$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                TimerContent.onServerInfoFetched$lambda$2(TimerContent.this, fetchedResponseMessage);
            }
        };
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final V7GetServerInfoInteractor getServerInfoInteractor() {
        V7GetServerInfoInteractor v7GetServerInfoInteractor = this.serverInfoInteractor;
        if (v7GetServerInfoInteractor != null) {
            return v7GetServerInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serverInfoInteractor");
        return null;
    }

    public final void setServerInfoInteractor(V7GetServerInfoInteractor v7GetServerInfoInteractor) {
        Intrinsics.checkNotNullParameter(v7GetServerInfoInteractor, "<set-?>");
        this.serverInfoInteractor = v7GetServerInfoInteractor;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/offer/TimerContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TIMER_INTERVAL", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/TimerContent;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimerContent> serializer() {
            return TimerContent$$serializer.INSTANCE;
        }
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public ViewBinding viewBinding(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OfferTimerItemBinding inflate = OfferTimerItemBinding.inflate(LayoutInflater.from(context));
        this.binding = inflate;
        OfferTimerItemBinding offerTimerItemBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        Context applicationContext = inflate.getRoot().getContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        OfferTimerItemBinding offerTimerItemBinding2 = this.binding;
        if (offerTimerItemBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            offerTimerItemBinding = offerTimerItemBinding2;
        }
        return offerTimerItemBinding;
    }

    @Override // org.betup.ui.dialogs.offer.OfferItemContent
    public void bind(OfferFragment.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        initTimer(builder.getExpiresAt());
    }

    private final void initTimer(final long expiresAt) {
        Timer timer = this.timer;
        if (timer != null && timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.timer = timer2;
        this.timerPaused = false;
        timer2.schedule(new TimerTask() { // from class: org.betup.ui.dialogs.offer.TimerContent$initTimer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean z;
                z = TimerContent.this.timerPaused;
                if (z) {
                    return;
                }
                TimerContent.this.updateTimer(expiresAt);
            }
        }, 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer(final long expiresAt) {
        if (getUserService().isRegistered()) {
            OfferTimerItemBinding offerTimerItemBinding = this.binding;
            if (offerTimerItemBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                offerTimerItemBinding = null;
            }
            Context context = offerTimerItemBinding.getRoot().getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type org.betup.ui.MainActivity");
            ((MainActivity) context).runOnUiThread(new Runnable() { // from class: org.betup.ui.dialogs.offer.TimerContent$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    TimerContent.updateTimer$lambda$1(TimerContent.this, expiresAt);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTimer$lambda$1(TimerContent timerContent, long j) {
        long remainingOfferTime = timerContent.getRemainingOfferTime(j);
        OfferTimerItemBinding offerTimerItemBinding = timerContent.binding;
        if (offerTimerItemBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            offerTimerItemBinding = null;
        }
        offerTimerItemBinding.timerTv.setText(DateHelper.formatMillisToHourMinSecs(remainingOfferTime));
        ObjectAnimator objectAnimator = timerContent.scaleAnimation;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            objectAnimator.start();
        }
        if (timerContent.numberOfTicks % 60 == 0) {
            Bundle bundle = new Bundle();
            OfferTimerItemBinding offerTimerItemBinding2 = timerContent.binding;
            if (offerTimerItemBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                offerTimerItemBinding2 = null;
            }
            bundle.putString("lang", SupportedLanguagesManager.getSupportedLanguage(offerTimerItemBinding2.getRoot().getContext(), SupportedLanguagesManager.LangTypeGroup.DEFAULT_4));
            timerContent.getServerInfoInteractor().load(timerContent.onServerInfoFetched, null, bundle);
        }
        timerContent.numberOfTicks++;
    }

    private final long getRemainingOfferTime(long offerFinishTimestamp) {
        return offerFinishTimestamp - (System.currentTimeMillis() + this.timestampCorrection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(TimerContent timerContent, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            return;
        }
        Long currentTimestamp = ((ServerInfoModel) fetchedResponseMessage.getModel()).getCurrentTimestamp();
        Intrinsics.checkNotNullExpressionValue(currentTimestamp, "getCurrentTimestamp(...)");
        timerContent.timestampCorrection = DateHelper.getMillisFromSeconds(currentTimestamp.longValue()) - System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onServerInfoFetched$lambda$2(TimerContent timerContent, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            return;
        }
        Long currentTimestamp = ((ServerInfoModel) fetchedResponseMessage.getModel()).getCurrentTimestamp();
        Intrinsics.checkNotNullExpressionValue(currentTimestamp, "getCurrentTimestamp(...)");
        timerContent.timestampCorrection = DateHelper.getMillisFromSeconds(currentTimestamp.longValue()) - System.currentTimeMillis();
    }
}
