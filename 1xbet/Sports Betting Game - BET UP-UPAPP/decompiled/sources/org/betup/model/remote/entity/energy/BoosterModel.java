package org.betup.model.remote.entity.energy;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BoosterModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/energy/BoosterModel;", "", "type", "Lorg/betup/model/remote/entity/energy/BoosterModel$BoosterType;", "exp", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/energy/BoosterModel$BoosterType;Ljava/lang/String;)V", "getType", "()Lorg/betup/model/remote/entity/energy/BoosterModel$BoosterType;", "getExp", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "BoosterType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BoosterModel {
    public static final int $stable = 0;

    @SerializedName("exp")
    private final String exp;

    @SerializedName("type")
    private final BoosterType type;

    public static /* synthetic */ BoosterModel copy$default(BoosterModel boosterModel, BoosterType boosterType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            boosterType = boosterModel.type;
        }
        if ((i & 2) != 0) {
            str = boosterModel.exp;
        }
        return boosterModel.copy(boosterType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BoosterType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExp() {
        return this.exp;
    }

    public final BoosterModel copy(BoosterType type, String exp) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new BoosterModel(type, exp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoosterModel)) {
            return false;
        }
        BoosterModel boosterModel = (BoosterModel) other;
        return this.type == boosterModel.type && Intrinsics.areEqual(this.exp, boosterModel.exp);
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.exp;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BoosterModel(type=" + this.type + ", exp=" + this.exp + ")";
    }

    public BoosterModel(BoosterType type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.exp = str;
    }

    public final BoosterType getType() {
        return this.type;
    }

    public final String getExp() {
        return this.exp;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BoosterModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/energy/BoosterModel$BoosterType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "INFINITE", "SPEED", "LIMIT", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoosterType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BoosterType[] $VALUES;

        @SerializedName("ultra")
        public static final BoosterType INFINITE = new BoosterType("INFINITE", 0);

        @SerializedName("speed")
        public static final BoosterType SPEED = new BoosterType("SPEED", 1);

        @SerializedName(MatchMyBetsInteractor.PARAM_LIMIT)
        public static final BoosterType LIMIT = new BoosterType("LIMIT", 2);

        private static final /* synthetic */ BoosterType[] $values() {
            return new BoosterType[]{INFINITE, SPEED, LIMIT};
        }

        public static EnumEntries<BoosterType> getEntries() {
            return $ENTRIES;
        }

        private BoosterType(String str, int i) {
        }

        static {
            BoosterType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static BoosterType valueOf(String str) {
            return (BoosterType) Enum.valueOf(BoosterType.class, str);
        }

        public static BoosterType[] values() {
            return (BoosterType[]) $VALUES.clone();
        }
    }
}
