package org.betup.ui.fragment.user;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserDetailsController.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab;", "", "id", "", "titleRes", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(II)V", "getId", "()I", "getTitleRes", "Stats", "Activity", "Bets", "About", "Ranking", VastTagName.COMPANION, "Lorg/betup/ui/fragment/user/UserDetailsTab$About;", "Lorg/betup/ui/fragment/user/UserDetailsTab$Activity;", "Lorg/betup/ui/fragment/user/UserDetailsTab$Bets;", "Lorg/betup/ui/fragment/user/UserDetailsTab$Ranking;", "Lorg/betup/ui/fragment/user/UserDetailsTab$Stats;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UserDetailsTab {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<UserDetailsTab> allTabs = CollectionsKt.listOf((Object[]) new UserDetailsTab[]{Stats.INSTANCE, Activity.INSTANCE, Bets.INSTANCE, About.INSTANCE, Ranking.INSTANCE});
    private final int id;
    private final int titleRes;

    public /* synthetic */ UserDetailsTab(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab$Stats;", "Lorg/betup/ui/fragment/user/UserDetailsTab;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Stats extends UserDetailsTab {
        public static final int $stable = 0;
        public static final Stats INSTANCE = new Stats();

        private Stats() {
            super(0, R.string.stats, null);
        }
    }

    private UserDetailsTab(int i, int i2) {
        this.id = i;
        this.titleRes = i2;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab$Activity;", "Lorg/betup/ui/fragment/user/UserDetailsTab;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Activity extends UserDetailsTab {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(1, R.string.activity, null);
        }
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab$Bets;", "Lorg/betup/ui/fragment/user/UserDetailsTab;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bets extends UserDetailsTab {
        public static final int $stable = 0;
        public static final Bets INSTANCE = new Bets();

        private Bets() {
            super(4, R.string.bets, null);
        }
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab$About;", "Lorg/betup/ui/fragment/user/UserDetailsTab;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class About extends UserDetailsTab {
        public static final int $stable = 0;
        public static final About INSTANCE = new About();

        private About() {
            super(2, R.string.about, null);
        }
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab$Ranking;", "Lorg/betup/ui/fragment/user/UserDetailsTab;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ranking extends UserDetailsTab {
        public static final int $stable = 0;
        public static final Ranking INSTANCE = new Ranking();

        private Ranking() {
            super(3, R.string.rankings, null);
        }
    }

    /* compiled from: UserDetailsController.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/user/UserDetailsTab$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "allTabs", "", "Lorg/betup/ui/fragment/user/UserDetailsTab;", "getAllTabs", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<UserDetailsTab> getAllTabs() {
            return UserDetailsTab.allTabs;
        }
    }
}
