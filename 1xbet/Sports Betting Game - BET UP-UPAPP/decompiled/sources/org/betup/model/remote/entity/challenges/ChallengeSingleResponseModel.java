package org.betup.model.remote.entity.challenges;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.MetaModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeSingleResponseModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeSingleResponseModel;", "", Mechanism.JsonKeys.META, "Lorg/betup/model/remote/entity/MetaModel;", ClientData.KEY_CHALLENGE, "Lorg/betup/model/remote/entity/challenges/ChallengeDataModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/MetaModel;Lorg/betup/model/remote/entity/challenges/ChallengeDataModel;)V", "getMeta", "()Lorg/betup/model/remote/entity/MetaModel;", "getChallenge", "()Lorg/betup/model/remote/entity/challenges/ChallengeDataModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChallengeSingleResponseModel {
    public static final int $stable = 8;

    @SerializedName("response")
    private final ChallengeDataModel challenge;

    @SerializedName(Mechanism.JsonKeys.META)
    private final MetaModel meta;

    public static /* synthetic */ ChallengeSingleResponseModel copy$default(ChallengeSingleResponseModel challengeSingleResponseModel, MetaModel metaModel, ChallengeDataModel challengeDataModel, int i, Object obj) {
        if ((i & 1) != 0) {
            metaModel = challengeSingleResponseModel.meta;
        }
        if ((i & 2) != 0) {
            challengeDataModel = challengeSingleResponseModel.challenge;
        }
        return challengeSingleResponseModel.copy(metaModel, challengeDataModel);
    }

    /* renamed from: component1, reason: from getter */
    public final MetaModel getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final ChallengeDataModel getChallenge() {
        return this.challenge;
    }

    public final ChallengeSingleResponseModel copy(MetaModel meta, ChallengeDataModel challenge) {
        return new ChallengeSingleResponseModel(meta, challenge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeSingleResponseModel)) {
            return false;
        }
        ChallengeSingleResponseModel challengeSingleResponseModel = (ChallengeSingleResponseModel) other;
        return Intrinsics.areEqual(this.meta, challengeSingleResponseModel.meta) && Intrinsics.areEqual(this.challenge, challengeSingleResponseModel.challenge);
    }

    public int hashCode() {
        MetaModel metaModel = this.meta;
        int hashCode = (metaModel == null ? 0 : metaModel.hashCode()) * 31;
        ChallengeDataModel challengeDataModel = this.challenge;
        return hashCode + (challengeDataModel != null ? challengeDataModel.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeSingleResponseModel(meta=" + this.meta + ", challenge=" + this.challenge + ")";
    }

    public ChallengeSingleResponseModel(MetaModel metaModel, ChallengeDataModel challengeDataModel) {
        this.meta = metaModel;
        this.challenge = challengeDataModel;
    }

    public final MetaModel getMeta() {
        return this.meta;
    }

    public final ChallengeDataModel getChallenge() {
        return this.challenge;
    }
}
