package kotlin.reflect.jvm.internal.impl.incremental.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ScopeKind {
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind CLASSIFIER;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind PACKAGE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ScopeKind(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind = new kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind("PACKAGE", 0);
        PACKAGE = scopeKind;
        kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind2 = new kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind("CLASSIFIER", 1);
        CLASSIFIER = scopeKind2;
        kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] scopeKindArr = {scopeKind, scopeKind2};
        Camera2StreamConfigurationMap = scopeKindArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(scopeKindArr);
    }

    public static kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.class, str);
    }
}
