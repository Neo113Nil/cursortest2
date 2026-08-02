package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public interface NameConstraintValidator {
    void addExcludedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree);

    void checkExcluded(org.bouncycastle.asn1.x509.GeneralName generalName) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException;

    void checkPermitted(org.bouncycastle.asn1.x509.GeneralName generalName) throws org.bouncycastle.asn1.x509.NameConstraintValidatorException;

    void intersectEmptyPermittedSubtree(int i);

    void intersectPermittedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree);

    void intersectPermittedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr);
}
