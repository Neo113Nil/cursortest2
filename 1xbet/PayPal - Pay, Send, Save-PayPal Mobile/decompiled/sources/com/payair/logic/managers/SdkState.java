package com.payair.logic.managers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/payair/logic/managers/SdkState;", "", "Initialized", "Uninitialized", "Unknown", "Wiped"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SdkState {
    public static final com.payair.logic.managers.SdkState Initialized;
    public static final com.payair.logic.managers.SdkState Uninitialized;
    public static final com.payair.logic.managers.SdkState Unknown;
    public static final com.payair.logic.managers.SdkState Wiped;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.payair.logic.managers.SdkState[] f4451a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.payair.logic.managers.SdkState sdkState = new com.payair.logic.managers.SdkState("Initialized", 0);
        Initialized = sdkState;
        com.payair.logic.managers.SdkState sdkState2 = new com.payair.logic.managers.SdkState("Uninitialized", 1);
        Uninitialized = sdkState2;
        com.payair.logic.managers.SdkState sdkState3 = new com.payair.logic.managers.SdkState("Unknown", 2);
        Unknown = sdkState3;
        com.payair.logic.managers.SdkState sdkState4 = new com.payair.logic.managers.SdkState("Wiped", 3);
        Wiped = sdkState4;
        com.payair.logic.managers.SdkState[] sdkStateArr = {sdkState, sdkState2, sdkState3, sdkState4};
        f4451a = sdkStateArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(sdkStateArr);
    }

    public SdkState(java.lang.String str, int i) {
    }

    public static com.payair.logic.managers.SdkState[] values() {
        return (com.payair.logic.managers.SdkState[]) f4451a.clone();
    }

    public static com.payair.logic.managers.SdkState valueOf(java.lang.String str) {
        return (com.payair.logic.managers.SdkState) java.lang.Enum.valueOf(com.payair.logic.managers.SdkState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.managers.SdkState> getEntries() {
        return b;
    }
}
