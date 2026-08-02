package org.bouncycastle.math.field;

/* loaded from: classes17.dex */
class GenericPolynomialExtensionField implements org.bouncycastle.math.field.PolynomialExtensionField {
    protected final org.bouncycastle.math.field.FiniteField Camera2StreamConfigurationMap;
    protected final org.bouncycastle.math.field.Polynomial getHighSpeedVideoSizes;

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode() ^ org.bouncycastle.util.Integers.rotateLeft(this.getHighSpeedVideoSizes.hashCode(), 16);
    }

    @Override // org.bouncycastle.math.field.ExtensionField
    public org.bouncycastle.math.field.FiniteField getSubfield() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.math.field.PolynomialExtensionField
    public org.bouncycastle.math.field.Polynomial getMinimalPolynomial() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public int getDimension() {
        return this.Camera2StreamConfigurationMap.getDimension() * this.getHighSpeedVideoSizes.getDegree();
    }

    @Override // org.bouncycastle.math.field.ExtensionField
    public int getDegree() {
        return this.getHighSpeedVideoSizes.getDegree();
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public java.math.BigInteger getCharacteristic() {
        return this.Camera2StreamConfigurationMap.getCharacteristic();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.math.field.GenericPolynomialExtensionField)) {
            return false;
        }
        org.bouncycastle.math.field.GenericPolynomialExtensionField genericPolynomialExtensionField = (org.bouncycastle.math.field.GenericPolynomialExtensionField) obj;
        return this.Camera2StreamConfigurationMap.equals(genericPolynomialExtensionField.Camera2StreamConfigurationMap) && this.getHighSpeedVideoSizes.equals(genericPolynomialExtensionField.getHighSpeedVideoSizes);
    }

    GenericPolynomialExtensionField(org.bouncycastle.math.field.FiniteField finiteField, org.bouncycastle.math.field.Polynomial polynomial) {
        this.Camera2StreamConfigurationMap = finiteField;
        this.getHighSpeedVideoSizes = polynomial;
    }
}
