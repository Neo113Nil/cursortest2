package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/shop/EntitlementStatus;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ACTIVE", "COMPLETED", "EXPIRED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EntitlementStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EntitlementStatus[] $VALUES;

    @SerializedName("ACTIVE")
    public static final EntitlementStatus ACTIVE = new EntitlementStatus("ACTIVE", 0);

    @SerializedName("COMPLETED")
    public static final EntitlementStatus COMPLETED = new EntitlementStatus("COMPLETED", 1);

    @SerializedName("EXPIRED")
    public static final EntitlementStatus EXPIRED = new EntitlementStatus("EXPIRED", 2);

    private static final /* synthetic */ EntitlementStatus[] $values() {
        return new EntitlementStatus[]{ACTIVE, COMPLETED, EXPIRED};
    }

    public static EnumEntries<EntitlementStatus> getEntries() {
        return $ENTRIES;
    }

    private EntitlementStatus(String str, int i) {
    }

    static {
        EntitlementStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static EntitlementStatus valueOf(String str) {
        return (EntitlementStatus) Enum.valueOf(EntitlementStatus.class, str);
    }

    public static EntitlementStatus[] values() {
        return (EntitlementStatus[]) $VALUES.clone();
    }
}
