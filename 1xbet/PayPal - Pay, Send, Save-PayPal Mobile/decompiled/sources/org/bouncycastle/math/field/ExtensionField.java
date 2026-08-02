package org.bouncycastle.math.field;

/* loaded from: classes17.dex */
public interface ExtensionField extends org.bouncycastle.math.field.FiniteField {
    int getDegree();

    org.bouncycastle.math.field.FiniteField getSubfield();
}
