package com.onesignal.core.internal.operations;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ExecutionResult {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ ExecutionResult[] $VALUES;
    public static final ExecutionResult SUCCESS = new ExecutionResult("SUCCESS", 0);
    public static final ExecutionResult SUCCESS_STARTING_ONLY = new ExecutionResult("SUCCESS_STARTING_ONLY", 1);
    public static final ExecutionResult FAIL_RETRY = new ExecutionResult("FAIL_RETRY", 2);
    public static final ExecutionResult FAIL_NORETRY = new ExecutionResult("FAIL_NORETRY", 3);
    public static final ExecutionResult FAIL_UNAUTHORIZED = new ExecutionResult("FAIL_UNAUTHORIZED", 4);
    public static final ExecutionResult FAIL_CONFLICT = new ExecutionResult("FAIL_CONFLICT", 5);
    public static final ExecutionResult FAIL_PAUSE_OPREPO = new ExecutionResult("FAIL_PAUSE_OPREPO", 6);

    private static final /* synthetic */ ExecutionResult[] $values() {
        return new ExecutionResult[]{SUCCESS, SUCCESS_STARTING_ONLY, FAIL_RETRY, FAIL_NORETRY, FAIL_UNAUTHORIZED, FAIL_CONFLICT, FAIL_PAUSE_OPREPO};
    }

    static {
        ExecutionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private ExecutionResult(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static ExecutionResult valueOf(String str) {
        return (ExecutionResult) Enum.valueOf(ExecutionResult.class, str);
    }

    public static ExecutionResult[] values() {
        return (ExecutionResult[]) $VALUES.clone();
    }
}
