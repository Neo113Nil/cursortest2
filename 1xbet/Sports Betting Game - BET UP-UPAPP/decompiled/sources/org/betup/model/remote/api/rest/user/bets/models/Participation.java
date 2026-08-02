package org.betup.model.remote.api.rest.user.bets.models;

import com.ironsource.C3732u;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.betup.R;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchShortDetailsDataModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: Participation.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010$\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010%\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020'J\u001a\u0010\u0016\u001a\u00020\u000b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0)J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003JY\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00103\u001a\u00020'2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0011HÖ\u0001J\t\u00106\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00068"}, d2 = {"Lorg/betup/model/remote/api/rest/user/bets/models/Participation;", "", "tier", "Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationTier;", "status", "Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationStatus;", "date", "Ljava/util/Date;", "coef", "", "matchName", "", C3732u.j, "", "match", "Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationTier;Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationStatus;Ljava/util/Date;DLjava/lang/String;JLorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;I)V", "getTier", "()Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationTier;", "getStatus", "()Lorg/betup/model/remote/api/rest/user/bets/models/ParticipationStatus;", "getDate", "()Ljava/util/Date;", "getCoef", "()D", "getMatchName", "()Ljava/lang/String;", "getReward", "()J", "getMatch", "()Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", "getId", "()I", "getPlaceIconResource", "getTime", "isWon", "", "getString", "Lkotlin/Function1;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Participation {
    private final double coef;
    private final Date date;
    private final int id;
    private final MatchShortDetailsDataModel match;
    private final String matchName;
    private final long reward;
    private final ParticipationStatus status;
    private final ParticipationTier tier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Participation.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ParticipationTier.values().length];
            try {
                iArr[ParticipationTier.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParticipationTier.SILVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParticipationTier.BRONZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ParticipationTier.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParticipationStatus.values().length];
            try {
                iArr2[ParticipationStatus.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ParticipationStatus.WON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ParticipationStatus.LOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ParticipationStatus.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final ParticipationTier getTier() {
        return this.tier;
    }

    /* renamed from: component2, reason: from getter */
    public final ParticipationStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final double getCoef() {
        return this.coef;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMatchName() {
        return this.matchName;
    }

    /* renamed from: component6, reason: from getter */
    public final long getReward() {
        return this.reward;
    }

    /* renamed from: component7, reason: from getter */
    public final MatchShortDetailsDataModel getMatch() {
        return this.match;
    }

    /* renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final Participation copy(ParticipationTier tier, ParticipationStatus status, Date date, double coef, String matchName, long reward, MatchShortDetailsDataModel match, int id) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(matchName, "matchName");
        Intrinsics.checkNotNullParameter(match, "match");
        return new Participation(tier, status, date, coef, matchName, reward, match, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Participation)) {
            return false;
        }
        Participation participation = (Participation) other;
        return this.tier == participation.tier && this.status == participation.status && Intrinsics.areEqual(this.date, participation.date) && Double.compare(this.coef, participation.coef) == 0 && Intrinsics.areEqual(this.matchName, participation.matchName) && this.reward == participation.reward && Intrinsics.areEqual(this.match, participation.match) && this.id == participation.id;
    }

    public int hashCode() {
        return (((((((((((((this.tier.hashCode() * 31) + this.status.hashCode()) * 31) + this.date.hashCode()) * 31) + Double.hashCode(this.coef)) * 31) + this.matchName.hashCode()) * 31) + Long.hashCode(this.reward)) * 31) + this.match.hashCode()) * 31) + Integer.hashCode(this.id);
    }

    public String toString() {
        return "Participation(tier=" + this.tier + ", status=" + this.status + ", date=" + this.date + ", coef=" + this.coef + ", matchName=" + this.matchName + ", reward=" + this.reward + ", match=" + this.match + ", id=" + this.id + ")";
    }

    public Participation(ParticipationTier tier, ParticipationStatus status, Date date, double d, String matchName, long j, MatchShortDetailsDataModel match, int i) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(matchName, "matchName");
        Intrinsics.checkNotNullParameter(match, "match");
        this.tier = tier;
        this.status = status;
        this.date = date;
        this.coef = d;
        this.matchName = matchName;
        this.reward = j;
        this.match = match;
        this.id = i;
        if (status == ParticipationStatus.WON && j <= 0) {
            throw new IllegalArgumentException("Reward must be greater than 0".toString());
        }
    }

    public /* synthetic */ Participation(ParticipationTier participationTier, ParticipationStatus participationStatus, Date date, double d, String str, long j, MatchShortDetailsDataModel matchShortDetailsDataModel, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(participationTier, participationStatus, date, d, str, (i2 & 32) != 0 ? 0L : j, matchShortDetailsDataModel, (i2 & 128) != 0 ? 0 : i);
    }

    public final ParticipationTier getTier() {
        return this.tier;
    }

    public final ParticipationStatus getStatus() {
        return this.status;
    }

    /* renamed from: getDate, reason: collision with other method in class */
    public final Date m12699getDate() {
        return this.date;
    }

    public final double getCoef() {
        return this.coef;
    }

    public final String getMatchName() {
        return this.matchName;
    }

    public final long getReward() {
        return this.reward;
    }

    public final MatchShortDetailsDataModel getMatch() {
        return this.match;
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: Participation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/api/rest/user/bets/models/Participation$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "from", "Lorg/betup/model/remote/api/rest/user/bets/models/Participation;", "participationModel", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: Participation.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MatchState.values().length];
                try {
                    iArr[MatchState.CANCELED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MatchState.LIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MatchState.FINISHED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Participation from(QuizParticipationModel participationModel) {
            ParticipationTier participationTier;
            ParticipationStatus participationStatus;
            Intrinsics.checkNotNullParameter(participationModel, "participationModel");
            long id = participationModel.getTier().getId();
            if (id == 3) {
                participationTier = ParticipationTier.GOLD;
            } else if (id == 2) {
                participationTier = ParticipationTier.SILVER;
            } else if (id == 1) {
                participationTier = ParticipationTier.BRONZE;
            } else {
                participationTier = ParticipationTier.NONE;
            }
            ParticipationTier participationTier2 = participationTier;
            MatchShortDetailsDataModel match = participationModel.getQuiz().getMatch();
            if (participationModel.getMoneyReturned() > 0) {
                participationStatus = ParticipationStatus.WON;
            } else {
                int i = WhenMappings.$EnumSwitchMapping$0[match.getMatchState().ordinal()];
                if (i == 1) {
                    participationStatus = ParticipationStatus.CANCELLED;
                } else if (i == 2) {
                    participationStatus = ParticipationStatus.IN_PROGRESS;
                } else if (i == 3) {
                    participationStatus = ParticipationStatus.LOST;
                } else {
                    participationStatus = ParticipationStatus.IN_PROGRESS;
                }
            }
            ParticipationStatus participationStatus2 = participationStatus;
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(match.getDate());
            double totalCoefficient = participationModel.getTotalCoefficient();
            String str = match.getHomeTeam().getName() + " vs " + match.getAwayTeam().getName();
            long moneyReturned = participationModel.getMoneyReturned();
            Intrinsics.checkNotNull(parse);
            return new Participation(participationTier2, participationStatus2, parse, totalCoefficient, str, moneyReturned, participationModel.getQuiz().getMatch(), participationModel.getId());
        }
    }

    public final int getPlaceIconResource() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.tier.ordinal()];
        if (i == 1) {
            return R.drawable.challenge_gold_ic;
        }
        if (i == 2) {
            return R.drawable.challenge_silver_ic;
        }
        if (i == 3 || i == 4) {
            return R.drawable.challenge_bronze_ic;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getDate() {
        return ParticipationKt.toString(this.date, "dd.MM.yyyy");
    }

    public final String getTime() {
        return ParticipationKt.toString(this.date, "HH:mm");
    }

    /* renamed from: getCoef, reason: collision with other method in class */
    public final String m12698getCoef() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.coef)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final boolean isWon() {
        return this.status == ParticipationStatus.WON;
    }

    public final String getStatus(Function1<? super Integer, String> getString) {
        Intrinsics.checkNotNullParameter(getString, "getString");
        int i = WhenMappings.$EnumSwitchMapping$1[this.status.ordinal()];
        if (i == 1 || i == 2) {
            return "+" + this.reward;
        }
        if (i == 3) {
            return getString.invoke(Integer.valueOf(R.string.quiz_history_status_lost));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return getString.invoke(Integer.valueOf(R.string.quiz_history_status_in_progress));
    }
}
