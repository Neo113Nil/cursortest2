package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;
    private final int id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public final int getId() {
        return this.id;
    }

    public final java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public final java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
