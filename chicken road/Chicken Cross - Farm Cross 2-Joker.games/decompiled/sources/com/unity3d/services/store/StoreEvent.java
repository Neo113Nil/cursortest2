package com.unity3d.services.store;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoreEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/store/StoreEvent;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZATION_REQUEST_RESULT", "INITIALIZATION_REQUEST_FAILED", "DISCONNECTED_RESULT", "PURCHASES_ON_RESUME_RESULT", "PURCHASES_ON_RESUME_ERROR", "PURCHASES_UPDATED_RESULT", "PURCHASES_UPDATED_ERROR", "PURCHASES_REQUEST_RESULT", "PURCHASES_REQUEST_ERROR", "PURCHASE_HISTORY_LIST_REQUEST_RESULT", "PURCHASE_HISTORY_LIST_REQUEST_ERROR", "SKU_DETAILS_LIST_REQUEST_RESULT", "SKU_DETAILS_LIST_REQUEST_ERROR", "IS_FEATURE_SUPPORTED_REQUEST_RESULT", "IS_FEATURE_SUPPORTED_REQUEST_ERROR", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoreEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StoreEvent[] $VALUES;
    public static final StoreEvent INITIALIZATION_REQUEST_RESULT = new StoreEvent("INITIALIZATION_REQUEST_RESULT", 0);
    public static final StoreEvent INITIALIZATION_REQUEST_FAILED = new StoreEvent("INITIALIZATION_REQUEST_FAILED", 1);
    public static final StoreEvent DISCONNECTED_RESULT = new StoreEvent("DISCONNECTED_RESULT", 2);
    public static final StoreEvent PURCHASES_ON_RESUME_RESULT = new StoreEvent("PURCHASES_ON_RESUME_RESULT", 3);
    public static final StoreEvent PURCHASES_ON_RESUME_ERROR = new StoreEvent("PURCHASES_ON_RESUME_ERROR", 4);
    public static final StoreEvent PURCHASES_UPDATED_RESULT = new StoreEvent("PURCHASES_UPDATED_RESULT", 5);
    public static final StoreEvent PURCHASES_UPDATED_ERROR = new StoreEvent("PURCHASES_UPDATED_ERROR", 6);
    public static final StoreEvent PURCHASES_REQUEST_RESULT = new StoreEvent("PURCHASES_REQUEST_RESULT", 7);
    public static final StoreEvent PURCHASES_REQUEST_ERROR = new StoreEvent("PURCHASES_REQUEST_ERROR", 8);
    public static final StoreEvent PURCHASE_HISTORY_LIST_REQUEST_RESULT = new StoreEvent("PURCHASE_HISTORY_LIST_REQUEST_RESULT", 9);
    public static final StoreEvent PURCHASE_HISTORY_LIST_REQUEST_ERROR = new StoreEvent("PURCHASE_HISTORY_LIST_REQUEST_ERROR", 10);
    public static final StoreEvent SKU_DETAILS_LIST_REQUEST_RESULT = new StoreEvent("SKU_DETAILS_LIST_REQUEST_RESULT", 11);
    public static final StoreEvent SKU_DETAILS_LIST_REQUEST_ERROR = new StoreEvent("SKU_DETAILS_LIST_REQUEST_ERROR", 12);
    public static final StoreEvent IS_FEATURE_SUPPORTED_REQUEST_RESULT = new StoreEvent("IS_FEATURE_SUPPORTED_REQUEST_RESULT", 13);
    public static final StoreEvent IS_FEATURE_SUPPORTED_REQUEST_ERROR = new StoreEvent("IS_FEATURE_SUPPORTED_REQUEST_ERROR", 14);

    private static final /* synthetic */ StoreEvent[] $values() {
        return new StoreEvent[]{INITIALIZATION_REQUEST_RESULT, INITIALIZATION_REQUEST_FAILED, DISCONNECTED_RESULT, PURCHASES_ON_RESUME_RESULT, PURCHASES_ON_RESUME_ERROR, PURCHASES_UPDATED_RESULT, PURCHASES_UPDATED_ERROR, PURCHASES_REQUEST_RESULT, PURCHASES_REQUEST_ERROR, PURCHASE_HISTORY_LIST_REQUEST_RESULT, PURCHASE_HISTORY_LIST_REQUEST_ERROR, SKU_DETAILS_LIST_REQUEST_RESULT, SKU_DETAILS_LIST_REQUEST_ERROR, IS_FEATURE_SUPPORTED_REQUEST_RESULT, IS_FEATURE_SUPPORTED_REQUEST_ERROR};
    }

    public static EnumEntries<StoreEvent> getEntries() {
        return $ENTRIES;
    }

    private StoreEvent(String str, int i) {
    }

    static {
        StoreEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static StoreEvent valueOf(String str) {
        return (StoreEvent) Enum.valueOf(StoreEvent.class, str);
    }

    public static StoreEvent[] values() {
        return (StoreEvent[]) $VALUES.clone();
    }
}
