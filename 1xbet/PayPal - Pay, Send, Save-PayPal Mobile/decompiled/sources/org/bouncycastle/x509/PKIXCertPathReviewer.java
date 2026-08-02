package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class PKIXCertPathReviewer extends org.bouncycastle.x509.CertPathValidatorUtilities {
    protected java.security.cert.CertPath certPath;
    protected java.util.List certs;
    protected java.util.Date currentDate;
    protected java.util.List[] errors;
    private boolean getHighSpeedVideoSizes;
    protected int n;
    protected java.util.List[] notifications;
    protected java.security.cert.PKIXParameters pkixParams;
    protected java.security.cert.PolicyNode policyTree;
    protected java.security.PublicKey subjectPublicKey;
    protected java.security.cert.TrustAnchor trustAnchor;
    protected java.util.Date validDate;
    private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Extension.qCStatements.getId();
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints.getId();
    private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extension.authorityInfoAccess.getId();

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:97|98)|(3:(15:100|101|102|(11:104|105|(2:108|106)|109|110|(2:113|111)|114|115|116|117|118)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118)|117|118)|129|101|102|(0)|126|105|(1:106)|109|110|(1:111)|114|115|116) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:39|(2:142|143)(2:41|(2:136|137)(3:43|(2:47|(1:49))|50))|(2:51|52)|53|(18:97|98|(15:100|101|102|(11:104|105|(2:108|106)|109|110|(2:113|111)|114|115|116|117|118)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118)|129|101|102|(0)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118)(1:55)|(1:59)|60|(7:62|(1:66)|67|68|(2:70|(1:72))(1:93)|73|(9:75|(1:92)|79|80|81|83|84|86|87))|96|79|80|81|83|84|86|87) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:97|98|(15:100|101|102|(11:104|105|(2:108|106)|109|110|(2:113|111)|114|115|116|117|118)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118)|129|101|102|(0)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:5|(2:6|(1:8)(1:9))|10|(2:11|12)|(1:14)(2:714|(1:716)(34:717|718|719|(1:721)(1:729)|722|723|724|16|(5:18|19|(1:21)(1:711)|22|(1:30))(1:713)|(4:32|(1:34)(1:708)|35|36)(1:709)|37|(17:39|(2:142|143)(2:41|(2:136|137)(3:43|(2:47|(1:49))|50))|51|52|53|(18:97|98|(15:100|101|102|(11:104|105|(2:108|106)|109|110|(2:113|111)|114|115|116|117|118)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118)|129|101|102|(0)|126|105|(1:106)|109|110|(1:111)|114|115|116|117|118)(1:55)|(1:59)|60|(7:62|(1:66)|67|68|(2:70|(1:72))(1:93)|73|(9:75|(1:92)|79|80|81|83|84|86|87))|96|79|80|81|83|84|86|87)|147|148|149|150|(6:152|(10:154|155|156|158|159|160|161|162|163|(2:165|(5:168|169|170|171|166)))|193|194|(1:208)(4:196|(1:198)|199|(3:201|(2:204|202)|205)(1:207))|206)|213|214|(6:216|(2:(1:219)|220)|221|222|(2:228|229)|230)|236|237|(1:239)|240|241|(1:243)(1:703)|244|(1:246)(1:702)|247|(1:249)(1:701)|250|251|252|(4:253|(11:255|256|257|258|259|(1:505)(17:262|(4:265|(4:267|268|269|(2:271|272)(1:274))(1:279)|273|263)|280|281|(14:286|(4:289|(3:291|292|293)(1:295)|294|287)|296|(9:298|(1:302)|303|304|(4:306|(3:309|(1:318)|307)|320|316)|321|322|(3:324|(2:327|325)|328)|329)|458|(3:461|(13:463|464|465|466|(5:469|(10:472|(1:474)(5:491|(1:493)|489|490|488)|475|(4:478|(2:480|481)(1:483)|482|476)|484|(3:486|487|488)|489|490|488|470)|494|495|467)|496|497|304|(0)|321|322|(0)|329)(1:502)|459)|503|303|304|(0)|321|322|(0)|329)|504|(0)|458|(1:459)|503|303|304|(0)|321|322|(0)|329)|(1:331)|(3:335|336|337)|338|(14:343|344|(3:346|(4:349|350|(2:352|(1:354)(3:355|356|357))(3:358|359|360)|347)|361)|362|(7:364|(4:367|(2:369|370)(2:372|373)|371|365)|374|375|(4:378|(4:386|387|388|389)(2:380|(2:382|383)(1:385))|384|376)|398|399)(1:453)|400|(3:(1:403)|(1:405)(1:451)|(7:407|408|409|(2:411|(4:414|(3:424|425|(3:430|431|432))(3:416|417|(3:419|420|421)(1:423))|422|412))|435|436|(2:440|441)))(1:452)|450|408|409|(0)|435|436|(1:443)(3:438|440|441))(2:340|341)|342)(1:510)|699|700)))|15|16|(0)(0)|(0)(0)|37|(0)|147|148|149|150|(0)|213|214|(0)|236|237|(0)|240|241|(0)(0)|244|(0)(0)|247|(0)(0)|250|251|252|(5:253|(0)(0)|699|700|342)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0336, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0337, code lost:
    
        r13 = r3;
        r21 = r4;
        r12 = r5;
        r16 = r6;
        r15 = r9;
        r20 = r11;
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bf, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlAuthInfoAccError"), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x09f3, code lost:
    
        r17 = r1;
        r16 = r2;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x09fe, code lost:
    
        if (isSelfIssued(r7) != false) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0a00, code lost:
    
        if (r4 <= 0) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0a02, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0a04, code lost:
    
        r1 = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(r7, org.bouncycastle.x509.PKIXCertPathReviewer.POLICY_CONSTRAINTS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0a0c, code lost:
    
        if (r1 == null) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0a0e, code lost:
    
        r1 = r1.getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0a16, code lost:
    
        if (r1.hasMoreElements() == false) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0a18, code lost:
    
        r6 = (org.bouncycastle.asn1.ASN1TaggedObject) r1.nextElement();
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0a22, code lost:
    
        if (r6.getTagNo() == 0) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0a2e, code lost:
    
        if (org.bouncycastle.asn1.ASN1Integer.getInstance(r6, false).intValueExact() != 0) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0a30, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0a34, code lost:
    
        if (r29 != null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0a3c, code lost:
    
        if (r37.pkixParams.isExplicitPolicyRequired() != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0a3e, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0b84, code lost:
    
        if (r4 > 0) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0b86, code lost:
    
        if (r15 == null) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0b95, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicy"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0bb0, code lost:
    
        r1 = r37.pkixParams.getCertPathCheckers();
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0bc0, code lost:
    
        r2.next().init(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0bcb, code lost:
    
        r2 = r37.certs.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0bd5, code lost:
    
        r3 = (java.security.cert.X509Certificate) r37.certs.get(r2);
        r4 = r3.getCriticalExtensionOIDs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0be1, code lost:
    
        if (r4 != null) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0c9c, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0beb, code lost:
    
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.KEY_USAGE);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.CERTIFICATE_POLICIES);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.POLICY_MAPPINGS);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.INHIBIT_ANY_POLICY);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.ISSUING_DISTRIBUTION_POINT);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.DELTA_CRL_INDICATOR);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.POLICY_CONSTRAINTS);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.BASIC_CONSTRAINTS);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.SUBJECT_ALTERNATIVE_NAME);
        r4.remove(org.bouncycastle.x509.PKIXCertPathReviewer.NAME_CONSTRAINTS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c1d, code lost:
    
        if (r2 == 0) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0c1f, code lost:
    
        r4.remove(org.bouncycastle.asn1.x509.Extension.extendedKeyUsage.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0c28, code lost:
    
        r5 = org.bouncycastle.x509.PKIXCertPathReviewer.getHighSpeedVideoFpsRanges;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0c2e, code lost:
    
        if (r4.contains(r5) != false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0c36, code lost:
    
        r4.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0c39, code lost:
    
        r5 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0c43, code lost:
    
        r5.next().check(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0c4d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0c71, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.criticalExtensionError", new java.lang.Object[]{r0.getMessage(), r0, r0.getClass().getName()}), r0.getCause(), r37.certPath, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0c76, code lost:
    
        if (r4.isEmpty() == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0c78, code lost:
    
        r3 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0c82, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknownCriticalExt", new java.lang.Object[]{new org.bouncycastle.asn1.ASN1ObjectIdentifier(r3.next())}), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0ca0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0ca4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0cc2, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certPathCheckerError", new java.lang.Object[]{r0.getMessage(), r0, r0.getClass().getName()}), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0ca1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0cc3, code lost:
    
        addError(r0.getErrorMessage(), r0.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0cce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0a4d, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.explicitPolicy"), r37.certPath, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0a52, code lost:
    
        if (isAnyPolicy(r17) == false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0a5a, code lost:
    
        if (r37.pkixParams.isExplicitPolicyRequired() == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0a60, code lost:
    
        if (r12.isEmpty() != false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0a62, code lost:
    
        r1 = new java.util.HashSet();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0a6a, code lost:
    
        if (r2 >= r16) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0a6c, code lost:
    
        r7 = r3[r2];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0a73, code lost:
    
        if (r8 >= r7.size()) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0a75, code lost:
    
        r9 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0a83, code lost:
    
        if (r5.equals(r9.getValidPolicy()) == false) goto L735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0a85, code lost:
    
        r9 = r9.getChildren();
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0a8d, code lost:
    
        if (r9.hasNext() == false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0a8f, code lost:
    
        r1.add(r9.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0a97, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0a9a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0a9d, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0aa5, code lost:
    
        if (r1.hasNext() == false) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0aa7, code lost:
    
        r12.contains(((org.bouncycastle.jce.provider.PKIXPolicyNode) r1.next()).getValidPolicy());
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0ab5, code lost:
    
        if (r29 == null) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0ab7, code lost:
    
        r1 = r37.n - 1;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0abd, code lost:
    
        if (r1 < 0) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0abf, code lost:
    
        r2 = r3[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ac6, code lost:
    
        if (r5 >= r2.size()) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0ac8, code lost:
    
        r7 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0ad2, code lost:
    
        if (r7.hasChildren() != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0ad4, code lost:
    
        r6 = removePolicyNode(r6, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ad8, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0adb, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0b83, code lost:
    
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0aea, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.explicitPolicy"), r37.certPath, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0aeb, code lost:
    
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0aef, code lost:
    
        r1 = new java.util.HashSet();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0af7, code lost:
    
        if (r2 >= r16) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0af9, code lost:
    
        r7 = r3[r2];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0b00, code lost:
    
        if (r8 >= r7.size()) goto L743;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0b02, code lost:
    
        r9 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0b10, code lost:
    
        if (r5.equals(r9.getValidPolicy()) == false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0b12, code lost:
    
        r9 = r9.getChildren();
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0b1a, code lost:
    
        if (r9.hasNext() == false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0b1c, code lost:
    
        r11 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0b2a, code lost:
    
        if (r5.equals(r11.getValidPolicy()) != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0b2c, code lost:
    
        r1.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0b30, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0b33, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0b36, code lost:
    
        r1 = r1.iterator();
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0b40, code lost:
    
        if (r1.hasNext() == false) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0b42, code lost:
    
        r2 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r1.next();
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0b52, code lost:
    
        if (r7.contains(r2.getValidPolicy()) != false) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0b54, code lost:
    
        r6 = removePolicyNode(r6, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0b59, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x0b5c, code lost:
    
        if (r6 == null) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0b5e, code lost:
    
        r1 = r37.n - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0b62, code lost:
    
        if (r1 < 0) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0b64, code lost:
    
        r2 = r3[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0b6b, code lost:
    
        if (r5 >= r2.size()) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x0b6d, code lost:
    
        r7 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0b77, code lost:
    
        if (r7.hasChildren() != false) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0b79, code lost:
    
        r6 = removePolicyNode(r6, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0b7d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0b80, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0ba2, code lost:
    
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyConstExtError"), r37.certPath, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0531, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0532, code lost:
    
        addError(r0.getErrorMessage(), r0.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03f4, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pubKeyError"), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03f2, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba A[Catch: AnnotatedException -> 0x02bf, TRY_LEAVE, TryCatch #33 {AnnotatedException -> 0x02bf, blocks: (B:102:0x02b2, B:104:0x02ba), top: B:101:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dc A[LOOP:2: B:106:0x02d6->B:108:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0300 A[LOOP:3: B:111:0x02fa->B:113:0x0300, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0424 A[Catch: CertPathReviewerException -> 0x0531, TryCatch #14 {CertPathReviewerException -> 0x0531, blocks: (B:150:0x041a, B:152:0x0424, B:154:0x0432, B:156:0x0444, B:159:0x044a, B:161:0x044d, B:163:0x0450, B:166:0x045b, B:168:0x0461, B:170:0x0469, B:175:0x0474, B:176:0x048b, B:180:0x048d, B:181:0x049c, B:184:0x049e, B:185:0x04ba, B:188:0x04bc, B:189:0x04d8, B:191:0x04da, B:192:0x04f2, B:194:0x04f3, B:196:0x04fd, B:198:0x0507, B:199:0x050a, B:202:0x0511, B:204:0x0514, B:206:0x051c, B:211:0x0521, B:212:0x0530), top: B:149:0x041a, inners: #2, #5, #9, #16, #27, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05b2 A[LOOP:8: B:238:0x05b0->B:239:0x05b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x061d A[Catch: CertPathReviewerException -> 0x0ba3, TRY_ENTER, TRY_LEAVE, TryCatch #26 {CertPathReviewerException -> 0x0ba3, blocks: (B:251:0x0610, B:255:0x061d, B:258:0x062a, B:262:0x063a, B:263:0x0645, B:265:0x064b, B:268:0x066c, B:269:0x0674, B:271:0x067a, B:277:0x067f, B:278:0x068c, B:283:0x0698, B:286:0x069f, B:287:0x06a8, B:289:0x06ae, B:292:0x06b8, B:298:0x06bf, B:300:0x06c3, B:304:0x07ac, B:306:0x07b2, B:307:0x07b5, B:309:0x07bb, B:311:0x07c7, B:318:0x07ce, B:316:0x07d1, B:322:0x07d4, B:324:0x07da, B:325:0x07e3, B:327:0x07e9, B:336:0x080c, B:337:0x0818, B:338:0x0819, B:344:0x081d, B:346:0x0825, B:347:0x0829, B:349:0x082f, B:352:0x0855, B:354:0x085f, B:356:0x0868, B:357:0x0874, B:359:0x0875, B:360:0x0881, B:364:0x0888, B:365:0x0895, B:367:0x089b, B:369:0x08c1, B:371:0x08d9, B:372:0x08d0, B:375:0x08e0, B:376:0x08e8, B:378:0x08ee, B:387:0x08f6, B:382:0x0920, B:393:0x08fe, B:394:0x090a, B:396:0x090c, B:397:0x091b, B:400:0x0931, B:409:0x094b, B:411:0x0955, B:412:0x0959, B:414:0x095f, B:428:0x096e, B:417:0x097b, B:436:0x0988, B:438:0x0992, B:342:0x09d5, B:445:0x099a, B:446:0x09a8, B:448:0x09a9, B:449:0x09b7, B:456:0x09b9, B:457:0x09c8, B:458:0x06d2, B:459:0x06d6, B:461:0x06dc, B:464:0x06f2, B:466:0x06fc, B:467:0x0701, B:469:0x0707, B:470:0x0715, B:472:0x071b, B:474:0x0727, B:475:0x0735, B:476:0x073b, B:478:0x0741, B:486:0x075a, B:491:0x072b, B:493:0x072f, B:495:0x078e, B:500:0x079e, B:501:0x07ab, B:508:0x09e3, B:509:0x09f2, B:511:0x09f3, B:516:0x0a04, B:518:0x0a0e, B:519:0x0a12, B:521:0x0a18, B:524:0x0a25, B:538:0x0a36, B:544:0x0b89, B:545:0x0b95, B:600:0x0a41, B:601:0x0a4d, B:602:0x0a4e, B:604:0x0a54, B:606:0x0a5c, B:608:0x0a62, B:610:0x0a6c, B:611:0x0a6f, B:613:0x0a75, B:615:0x0a85, B:616:0x0a89, B:618:0x0a8f, B:620:0x0a97, B:623:0x0a9a, B:625:0x0a9d, B:626:0x0aa1, B:628:0x0aa7, B:631:0x0ab7, B:633:0x0abf, B:634:0x0ac2, B:636:0x0ac8, B:638:0x0ad4, B:640:0x0ad8, B:643:0x0adb, B:646:0x0ade, B:647:0x0aea, B:649:0x0aef, B:651:0x0af9, B:652:0x0afc, B:654:0x0b02, B:656:0x0b12, B:657:0x0b16, B:659:0x0b1c, B:662:0x0b2c, B:667:0x0b30, B:670:0x0b33, B:672:0x0b36, B:673:0x0b3c, B:675:0x0b42, B:677:0x0b54, B:683:0x0b5e, B:685:0x0b64, B:686:0x0b67, B:688:0x0b6d, B:690:0x0b79, B:692:0x0b7d, B:695:0x0b80, B:697:0x0b96, B:698:0x0ba2), top: B:250:0x0610, inners: #0, #7, #13, #19, #20, #23, #31, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06bf A[Catch: CertPathReviewerException -> 0x0ba3, TryCatch #26 {CertPathReviewerException -> 0x0ba3, blocks: (B:251:0x0610, B:255:0x061d, B:258:0x062a, B:262:0x063a, B:263:0x0645, B:265:0x064b, B:268:0x066c, B:269:0x0674, B:271:0x067a, B:277:0x067f, B:278:0x068c, B:283:0x0698, B:286:0x069f, B:287:0x06a8, B:289:0x06ae, B:292:0x06b8, B:298:0x06bf, B:300:0x06c3, B:304:0x07ac, B:306:0x07b2, B:307:0x07b5, B:309:0x07bb, B:311:0x07c7, B:318:0x07ce, B:316:0x07d1, B:322:0x07d4, B:324:0x07da, B:325:0x07e3, B:327:0x07e9, B:336:0x080c, B:337:0x0818, B:338:0x0819, B:344:0x081d, B:346:0x0825, B:347:0x0829, B:349:0x082f, B:352:0x0855, B:354:0x085f, B:356:0x0868, B:357:0x0874, B:359:0x0875, B:360:0x0881, B:364:0x0888, B:365:0x0895, B:367:0x089b, B:369:0x08c1, B:371:0x08d9, B:372:0x08d0, B:375:0x08e0, B:376:0x08e8, B:378:0x08ee, B:387:0x08f6, B:382:0x0920, B:393:0x08fe, B:394:0x090a, B:396:0x090c, B:397:0x091b, B:400:0x0931, B:409:0x094b, B:411:0x0955, B:412:0x0959, B:414:0x095f, B:428:0x096e, B:417:0x097b, B:436:0x0988, B:438:0x0992, B:342:0x09d5, B:445:0x099a, B:446:0x09a8, B:448:0x09a9, B:449:0x09b7, B:456:0x09b9, B:457:0x09c8, B:458:0x06d2, B:459:0x06d6, B:461:0x06dc, B:464:0x06f2, B:466:0x06fc, B:467:0x0701, B:469:0x0707, B:470:0x0715, B:472:0x071b, B:474:0x0727, B:475:0x0735, B:476:0x073b, B:478:0x0741, B:486:0x075a, B:491:0x072b, B:493:0x072f, B:495:0x078e, B:500:0x079e, B:501:0x07ab, B:508:0x09e3, B:509:0x09f2, B:511:0x09f3, B:516:0x0a04, B:518:0x0a0e, B:519:0x0a12, B:521:0x0a18, B:524:0x0a25, B:538:0x0a36, B:544:0x0b89, B:545:0x0b95, B:600:0x0a41, B:601:0x0a4d, B:602:0x0a4e, B:604:0x0a54, B:606:0x0a5c, B:608:0x0a62, B:610:0x0a6c, B:611:0x0a6f, B:613:0x0a75, B:615:0x0a85, B:616:0x0a89, B:618:0x0a8f, B:620:0x0a97, B:623:0x0a9a, B:625:0x0a9d, B:626:0x0aa1, B:628:0x0aa7, B:631:0x0ab7, B:633:0x0abf, B:634:0x0ac2, B:636:0x0ac8, B:638:0x0ad4, B:640:0x0ad8, B:643:0x0adb, B:646:0x0ade, B:647:0x0aea, B:649:0x0aef, B:651:0x0af9, B:652:0x0afc, B:654:0x0b02, B:656:0x0b12, B:657:0x0b16, B:659:0x0b1c, B:662:0x0b2c, B:667:0x0b30, B:670:0x0b33, B:672:0x0b36, B:673:0x0b3c, B:675:0x0b42, B:677:0x0b54, B:683:0x0b5e, B:685:0x0b64, B:686:0x0b67, B:688:0x0b6d, B:690:0x0b79, B:692:0x0b7d, B:695:0x0b80, B:697:0x0b96, B:698:0x0ba2), top: B:250:0x0610, inners: #0, #7, #13, #19, #20, #23, #31, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07b2 A[Catch: CertPathReviewerException -> 0x0ba3, TryCatch #26 {CertPathReviewerException -> 0x0ba3, blocks: (B:251:0x0610, B:255:0x061d, B:258:0x062a, B:262:0x063a, B:263:0x0645, B:265:0x064b, B:268:0x066c, B:269:0x0674, B:271:0x067a, B:277:0x067f, B:278:0x068c, B:283:0x0698, B:286:0x069f, B:287:0x06a8, B:289:0x06ae, B:292:0x06b8, B:298:0x06bf, B:300:0x06c3, B:304:0x07ac, B:306:0x07b2, B:307:0x07b5, B:309:0x07bb, B:311:0x07c7, B:318:0x07ce, B:316:0x07d1, B:322:0x07d4, B:324:0x07da, B:325:0x07e3, B:327:0x07e9, B:336:0x080c, B:337:0x0818, B:338:0x0819, B:344:0x081d, B:346:0x0825, B:347:0x0829, B:349:0x082f, B:352:0x0855, B:354:0x085f, B:356:0x0868, B:357:0x0874, B:359:0x0875, B:360:0x0881, B:364:0x0888, B:365:0x0895, B:367:0x089b, B:369:0x08c1, B:371:0x08d9, B:372:0x08d0, B:375:0x08e0, B:376:0x08e8, B:378:0x08ee, B:387:0x08f6, B:382:0x0920, B:393:0x08fe, B:394:0x090a, B:396:0x090c, B:397:0x091b, B:400:0x0931, B:409:0x094b, B:411:0x0955, B:412:0x0959, B:414:0x095f, B:428:0x096e, B:417:0x097b, B:436:0x0988, B:438:0x0992, B:342:0x09d5, B:445:0x099a, B:446:0x09a8, B:448:0x09a9, B:449:0x09b7, B:456:0x09b9, B:457:0x09c8, B:458:0x06d2, B:459:0x06d6, B:461:0x06dc, B:464:0x06f2, B:466:0x06fc, B:467:0x0701, B:469:0x0707, B:470:0x0715, B:472:0x071b, B:474:0x0727, B:475:0x0735, B:476:0x073b, B:478:0x0741, B:486:0x075a, B:491:0x072b, B:493:0x072f, B:495:0x078e, B:500:0x079e, B:501:0x07ab, B:508:0x09e3, B:509:0x09f2, B:511:0x09f3, B:516:0x0a04, B:518:0x0a0e, B:519:0x0a12, B:521:0x0a18, B:524:0x0a25, B:538:0x0a36, B:544:0x0b89, B:545:0x0b95, B:600:0x0a41, B:601:0x0a4d, B:602:0x0a4e, B:604:0x0a54, B:606:0x0a5c, B:608:0x0a62, B:610:0x0a6c, B:611:0x0a6f, B:613:0x0a75, B:615:0x0a85, B:616:0x0a89, B:618:0x0a8f, B:620:0x0a97, B:623:0x0a9a, B:625:0x0a9d, B:626:0x0aa1, B:628:0x0aa7, B:631:0x0ab7, B:633:0x0abf, B:634:0x0ac2, B:636:0x0ac8, B:638:0x0ad4, B:640:0x0ad8, B:643:0x0adb, B:646:0x0ade, B:647:0x0aea, B:649:0x0aef, B:651:0x0af9, B:652:0x0afc, B:654:0x0b02, B:656:0x0b12, B:657:0x0b16, B:659:0x0b1c, B:662:0x0b2c, B:667:0x0b30, B:670:0x0b33, B:672:0x0b36, B:673:0x0b3c, B:675:0x0b42, B:677:0x0b54, B:683:0x0b5e, B:685:0x0b64, B:686:0x0b67, B:688:0x0b6d, B:690:0x0b79, B:692:0x0b7d, B:695:0x0b80, B:697:0x0b96, B:698:0x0ba2), top: B:250:0x0610, inners: #0, #7, #13, #19, #20, #23, #31, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07da A[Catch: CertPathReviewerException -> 0x0ba3, TryCatch #26 {CertPathReviewerException -> 0x0ba3, blocks: (B:251:0x0610, B:255:0x061d, B:258:0x062a, B:262:0x063a, B:263:0x0645, B:265:0x064b, B:268:0x066c, B:269:0x0674, B:271:0x067a, B:277:0x067f, B:278:0x068c, B:283:0x0698, B:286:0x069f, B:287:0x06a8, B:289:0x06ae, B:292:0x06b8, B:298:0x06bf, B:300:0x06c3, B:304:0x07ac, B:306:0x07b2, B:307:0x07b5, B:309:0x07bb, B:311:0x07c7, B:318:0x07ce, B:316:0x07d1, B:322:0x07d4, B:324:0x07da, B:325:0x07e3, B:327:0x07e9, B:336:0x080c, B:337:0x0818, B:338:0x0819, B:344:0x081d, B:346:0x0825, B:347:0x0829, B:349:0x082f, B:352:0x0855, B:354:0x085f, B:356:0x0868, B:357:0x0874, B:359:0x0875, B:360:0x0881, B:364:0x0888, B:365:0x0895, B:367:0x089b, B:369:0x08c1, B:371:0x08d9, B:372:0x08d0, B:375:0x08e0, B:376:0x08e8, B:378:0x08ee, B:387:0x08f6, B:382:0x0920, B:393:0x08fe, B:394:0x090a, B:396:0x090c, B:397:0x091b, B:400:0x0931, B:409:0x094b, B:411:0x0955, B:412:0x0959, B:414:0x095f, B:428:0x096e, B:417:0x097b, B:436:0x0988, B:438:0x0992, B:342:0x09d5, B:445:0x099a, B:446:0x09a8, B:448:0x09a9, B:449:0x09b7, B:456:0x09b9, B:457:0x09c8, B:458:0x06d2, B:459:0x06d6, B:461:0x06dc, B:464:0x06f2, B:466:0x06fc, B:467:0x0701, B:469:0x0707, B:470:0x0715, B:472:0x071b, B:474:0x0727, B:475:0x0735, B:476:0x073b, B:478:0x0741, B:486:0x075a, B:491:0x072b, B:493:0x072f, B:495:0x078e, B:500:0x079e, B:501:0x07ab, B:508:0x09e3, B:509:0x09f2, B:511:0x09f3, B:516:0x0a04, B:518:0x0a0e, B:519:0x0a12, B:521:0x0a18, B:524:0x0a25, B:538:0x0a36, B:544:0x0b89, B:545:0x0b95, B:600:0x0a41, B:601:0x0a4d, B:602:0x0a4e, B:604:0x0a54, B:606:0x0a5c, B:608:0x0a62, B:610:0x0a6c, B:611:0x0a6f, B:613:0x0a75, B:615:0x0a85, B:616:0x0a89, B:618:0x0a8f, B:620:0x0a97, B:623:0x0a9a, B:625:0x0a9d, B:626:0x0aa1, B:628:0x0aa7, B:631:0x0ab7, B:633:0x0abf, B:634:0x0ac2, B:636:0x0ac8, B:638:0x0ad4, B:640:0x0ad8, B:643:0x0adb, B:646:0x0ade, B:647:0x0aea, B:649:0x0aef, B:651:0x0af9, B:652:0x0afc, B:654:0x0b02, B:656:0x0b12, B:657:0x0b16, B:659:0x0b1c, B:662:0x0b2c, B:667:0x0b30, B:670:0x0b33, B:672:0x0b36, B:673:0x0b3c, B:675:0x0b42, B:677:0x0b54, B:683:0x0b5e, B:685:0x0b64, B:686:0x0b67, B:688:0x0b6d, B:690:0x0b79, B:692:0x0b7d, B:695:0x0b80, B:697:0x0b96, B:698:0x0ba2), top: B:250:0x0610, inners: #0, #7, #13, #19, #20, #23, #31, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0955 A[Catch: AnnotatedException -> 0x09a9, CertPathReviewerException -> 0x0ba3, TryCatch #19 {AnnotatedException -> 0x09a9, blocks: (B:409:0x094b, B:411:0x0955, B:412:0x0959, B:414:0x095f, B:428:0x096e, B:417:0x097b), top: B:408:0x094b, outer: #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x06dc A[Catch: CertPathReviewerException -> 0x0ba3, TRY_LEAVE, TryCatch #26 {CertPathReviewerException -> 0x0ba3, blocks: (B:251:0x0610, B:255:0x061d, B:258:0x062a, B:262:0x063a, B:263:0x0645, B:265:0x064b, B:268:0x066c, B:269:0x0674, B:271:0x067a, B:277:0x067f, B:278:0x068c, B:283:0x0698, B:286:0x069f, B:287:0x06a8, B:289:0x06ae, B:292:0x06b8, B:298:0x06bf, B:300:0x06c3, B:304:0x07ac, B:306:0x07b2, B:307:0x07b5, B:309:0x07bb, B:311:0x07c7, B:318:0x07ce, B:316:0x07d1, B:322:0x07d4, B:324:0x07da, B:325:0x07e3, B:327:0x07e9, B:336:0x080c, B:337:0x0818, B:338:0x0819, B:344:0x081d, B:346:0x0825, B:347:0x0829, B:349:0x082f, B:352:0x0855, B:354:0x085f, B:356:0x0868, B:357:0x0874, B:359:0x0875, B:360:0x0881, B:364:0x0888, B:365:0x0895, B:367:0x089b, B:369:0x08c1, B:371:0x08d9, B:372:0x08d0, B:375:0x08e0, B:376:0x08e8, B:378:0x08ee, B:387:0x08f6, B:382:0x0920, B:393:0x08fe, B:394:0x090a, B:396:0x090c, B:397:0x091b, B:400:0x0931, B:409:0x094b, B:411:0x0955, B:412:0x0959, B:414:0x095f, B:428:0x096e, B:417:0x097b, B:436:0x0988, B:438:0x0992, B:342:0x09d5, B:445:0x099a, B:446:0x09a8, B:448:0x09a9, B:449:0x09b7, B:456:0x09b9, B:457:0x09c8, B:458:0x06d2, B:459:0x06d6, B:461:0x06dc, B:464:0x06f2, B:466:0x06fc, B:467:0x0701, B:469:0x0707, B:470:0x0715, B:472:0x071b, B:474:0x0727, B:475:0x0735, B:476:0x073b, B:478:0x0741, B:486:0x075a, B:491:0x072b, B:493:0x072f, B:495:0x078e, B:500:0x079e, B:501:0x07ab, B:508:0x09e3, B:509:0x09f2, B:511:0x09f3, B:516:0x0a04, B:518:0x0a0e, B:519:0x0a12, B:521:0x0a18, B:524:0x0a25, B:538:0x0a36, B:544:0x0b89, B:545:0x0b95, B:600:0x0a41, B:601:0x0a4d, B:602:0x0a4e, B:604:0x0a54, B:606:0x0a5c, B:608:0x0a62, B:610:0x0a6c, B:611:0x0a6f, B:613:0x0a75, B:615:0x0a85, B:616:0x0a89, B:618:0x0a8f, B:620:0x0a97, B:623:0x0a9a, B:625:0x0a9d, B:626:0x0aa1, B:628:0x0aa7, B:631:0x0ab7, B:633:0x0abf, B:634:0x0ac2, B:636:0x0ac8, B:638:0x0ad4, B:640:0x0ad8, B:643:0x0adb, B:646:0x0ade, B:647:0x0aea, B:649:0x0aef, B:651:0x0af9, B:652:0x0afc, B:654:0x0b02, B:656:0x0b12, B:657:0x0b16, B:659:0x0b1c, B:662:0x0b2c, B:667:0x0b30, B:670:0x0b33, B:672:0x0b36, B:673:0x0b3c, B:675:0x0b42, B:677:0x0b54, B:683:0x0b5e, B:685:0x0b64, B:686:0x0b67, B:688:0x0b6d, B:690:0x0b79, B:692:0x0b7d, B:695:0x0b80, B:697:0x0b96, B:698:0x0ba2), top: B:250:0x0610, inners: #0, #7, #13, #19, #20, #23, #31, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x09f3 A[EDGE_INSN: B:510:0x09f3->B:511:0x09f3 BREAK  A[LOOP:9: B:253:0x0619->B:342:0x09d5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void doChecks() {
        java.lang.Throwable th;
        java.security.cert.TrustAnchor trustAnchor;
        org.bouncycastle.x509.CertPathReviewerException certPathReviewerException;
        java.security.cert.TrustAnchor trustAnchor2;
        javax.security.auth.x500.X500Principal x500Principal;
        java.security.cert.X509Certificate x509Certificate;
        java.security.PublicKey publicKey;
        int size;
        java.lang.String str;
        int size2;
        java.util.Set<java.lang.String> initialPolicies;
        int i;
        int i2;
        int i3;
        int i4;
        int size3;
        java.security.cert.X509Certificate x509Certificate2;
        java.util.HashSet hashSet;
        java.security.cert.X509Certificate x509Certificate3;
        int i5;
        java.lang.String str2;
        int i6;
        int i7;
        java.lang.String str3;
        java.util.HashSet hashSet2;
        java.lang.String str4;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer;
        int intValueExact;
        int intValueExact2;
        java.lang.String str5;
        java.util.HashSet hashSet3;
        java.util.Enumeration objects;
        java.util.HashSet hashSet4;
        java.lang.String id;
        java.lang.String str6;
        int i8;
        java.util.Set<java.lang.String> criticalExtensionOIDs;
        int i9;
        org.bouncycastle.asn1.x509.BasicConstraints basicConstraints;
        java.math.BigInteger pathLenConstraint;
        int intValue;
        int size4;
        org.bouncycastle.i18n.ErrorBundle errorBundle;
        org.bouncycastle.i18n.ErrorBundle errorBundle2;
        org.bouncycastle.asn1.x509.CRLDistPoint cRLDistPoint;
        org.bouncycastle.asn1.x509.AuthorityInformationAccess authorityInformationAccess;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.security.cert.X509Certificate x509Certificate4;
        int i10;
        int i11;
        java.security.PublicKey publicKey2;
        java.security.cert.TrustAnchor trustAnchor3;
        java.lang.String str7;
        javax.security.auth.x500.X500Principal x500Principal2;
        org.bouncycastle.asn1.ASN1Primitive extensionValue;
        org.bouncycastle.asn1.ASN1Primitive extensionValue2;
        char c;
        org.bouncycastle.asn1.x509.AuthorityKeyIdentifier authorityKeyIdentifier;
        org.bouncycastle.asn1.x509.GeneralNames authorityCertIssuer;
        boolean[] keyUsage;
        java.security.cert.X509Certificate x509Certificate5;
        java.util.Collection trustAnchors;
        java.lang.String str8 = "CertPathReviewer.policyExtError";
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i12 = this.n + 1;
        this.notifications = new java.util.List[i12];
        this.errors = new java.util.List[i12];
        char c2 = 0;
        int i13 = 0;
        while (true) {
            java.util.List[] listArr = this.notifications;
            if (i13 >= listArr.length) {
                break;
            }
            listArr[i13] = new java.util.ArrayList();
            this.errors[i13] = new java.util.ArrayList();
            i13++;
        }
        addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certPathValidDate", new java.lang.Object[]{new org.bouncycastle.i18n.filter.TrustedInput(this.validDate), new org.bouncycastle.i18n.filter.TrustedInput(this.currentDate)}));
        try {
            java.util.List list = this.certs;
            x509Certificate5 = (java.security.cert.X509Certificate) list.get(list.size() - 1);
            trustAnchors = getTrustAnchors(x509Certificate5, this.pkixParams.getTrustAnchors());
        } catch (org.bouncycastle.x509.CertPathReviewerException e) {
            certPathReviewerException = e;
            trustAnchor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            trustAnchor = null;
        }
        if (trustAnchors.size() > 1) {
            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.conflictingTrustAnchors", new java.lang.Object[]{org.bouncycastle.util.Integers.valueOf(trustAnchors.size()), new org.bouncycastle.i18n.filter.UntrustedInput(x509Certificate5.getIssuerX500Principal())}));
        } else if (trustAnchors.isEmpty()) {
            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noTrustAnchorFound", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(x509Certificate5.getIssuerX500Principal()), org.bouncycastle.util.Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
        } else {
            trustAnchor = (java.security.cert.TrustAnchor) trustAnchors.iterator().next();
            try {
                try {
                    org.bouncycastle.x509.CertPathValidatorUtilities.verifyX509Certificate(x509Certificate5, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                } catch (java.security.SignatureException unused) {
                    addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustButInvalidCert"));
                } catch (java.lang.Exception unused2) {
                }
            } catch (org.bouncycastle.x509.CertPathReviewerException e2) {
                certPathReviewerException = e2;
                addError(certPathReviewerException.getErrorMessage());
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                }
                if (trustAnchor2 == null) {
                }
                java.security.cert.X509Certificate x509Certificate6 = x509Certificate;
                javax.security.auth.x500.X500Principal x500Principal3 = x500Principal;
                java.security.PublicKey publicKey3 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                }
                str = str8;
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = publicKey3;
                org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator();
                while (size4 > 0) {
                }
                int i14 = this.n;
                int i15 = 0;
                while (size2 > 0) {
                }
                addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new java.lang.Object[]{org.bouncycastle.util.Integers.valueOf(i15)}));
                initialPolicies = this.pkixParams.getInitialPolicies();
                i = this.n + 1;
                java.util.ArrayList[] arrayListArr = new java.util.ArrayList[i];
                while (i2 < i) {
                }
                java.util.HashSet hashSet5 = new java.util.HashSet();
                java.lang.String str9 = "2.5.29.32.0";
                hashSet5.add("2.5.29.32.0");
                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), 0, hashSet5, null, new java.util.HashSet(), "2.5.29.32.0", false);
                arrayListArr[0].add(pKIXPolicyNode);
                if (this.pkixParams.isExplicitPolicyRequired()) {
                }
                if (!this.pkixParams.isAnyPolicyInhibited()) {
                }
                if (!this.pkixParams.isPolicyMappingInhibited()) {
                }
                size3 = this.certs.size() - i3;
                x509Certificate2 = null;
                hashSet = null;
                while (true) {
                    java.lang.String str10 = "CertPathReviewer.policyConstExtError";
                    if (size3 >= 0) {
                    }
                    addError(e.getErrorMessage(), e.getIndex());
                    size3--;
                    str = str4;
                    x509Certificate2 = x509Certificate3;
                    i = i5;
                    initialPolicies = r17;
                    hashSet = hashSet2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknown", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(th.getMessage()), new org.bouncycastle.i18n.filter.UntrustedInput(th)}));
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                }
                if (trustAnchor2 == null) {
                }
                java.security.cert.X509Certificate x509Certificate62 = x509Certificate;
                javax.security.auth.x500.X500Principal x500Principal32 = x500Principal;
                java.security.PublicKey publicKey32 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                }
                str = str8;
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = publicKey32;
                org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator2 = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator();
                while (size4 > 0) {
                }
                int i142 = this.n;
                int i152 = 0;
                while (size2 > 0) {
                }
                addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new java.lang.Object[]{org.bouncycastle.util.Integers.valueOf(i152)}));
                initialPolicies = this.pkixParams.getInitialPolicies();
                i = this.n + 1;
                java.util.ArrayList[] arrayListArr2 = new java.util.ArrayList[i];
                while (i2 < i) {
                }
                java.util.HashSet hashSet52 = new java.util.HashSet();
                java.lang.String str92 = "2.5.29.32.0";
                hashSet52.add("2.5.29.32.0");
                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode2 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), 0, hashSet52, null, new java.util.HashSet(), "2.5.29.32.0", false);
                arrayListArr2[0].add(pKIXPolicyNode2);
                if (this.pkixParams.isExplicitPolicyRequired()) {
                }
                if (!this.pkixParams.isAnyPolicyInhibited()) {
                }
                if (!this.pkixParams.isPolicyMappingInhibited()) {
                }
                size3 = this.certs.size() - i3;
                x509Certificate2 = null;
                hashSet = null;
                while (true) {
                    java.lang.String str102 = "CertPathReviewer.policyConstExtError";
                    if (size3 >= 0) {
                    }
                    addError(e.getErrorMessage(), e.getIndex());
                    size3--;
                    str = str4;
                    x509Certificate2 = x509Certificate3;
                    i = i5;
                    initialPolicies = r17;
                    hashSet = hashSet2;
                }
            }
            trustAnchor2 = trustAnchor;
            if (trustAnchor2 == null) {
                java.security.cert.X509Certificate trustedCert = trustAnchor2.getTrustedCert();
                try {
                    x500Principal = trustedCert != null ? getSubjectPrincipal(trustedCert) : new javax.security.auth.x500.X500Principal(trustAnchor2.getCAName());
                } catch (java.lang.IllegalArgumentException unused3) {
                    addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustDNInvalid", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(trustAnchor2.getCAName())}));
                    x500Principal = null;
                }
                if (trustedCert != null && (keyUsage = trustedCert.getKeyUsage()) != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustKeyUsage"));
                }
            } else {
                x500Principal = null;
            }
            if (trustAnchor2 == null) {
                x509Certificate = trustAnchor2.getTrustedCert();
                publicKey = x509Certificate != null ? x509Certificate.getPublicKey() : trustAnchor2.getCAPublicKey();
                try {
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = getAlgorithmIdentifier(publicKey);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                } catch (java.security.cert.CertPathValidatorException unused4) {
                    addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustPubKeyError"));
                }
            } else {
                x509Certificate = null;
                publicKey = null;
            }
            java.security.cert.X509Certificate x509Certificate622 = x509Certificate;
            javax.security.auth.x500.X500Principal x500Principal322 = x500Principal;
            java.security.PublicKey publicKey322 = publicKey;
            size = this.certs.size() - 1;
            while (size >= 0) {
                int i16 = this.n - size;
                java.security.cert.X509Certificate x509Certificate7 = (java.security.cert.X509Certificate) this.certs.get(size);
                if (publicKey322 != null) {
                    try {
                        org.bouncycastle.x509.CertPathValidatorUtilities.verifyX509Certificate(x509Certificate7, publicKey322, this.pkixParams.getSigProvider());
                    } catch (java.security.GeneralSecurityException e3) {
                        errorBundle = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.signatureNotVerified", new java.lang.Object[]{e3.getMessage(), e3, e3.getClass().getName()});
                        addError(errorBundle, size);
                        x509Certificate7.checkValidity(this.validDate);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal2 != null) {
                        }
                        if (i10 != this.n) {
                        }
                        c = 5;
                        x500Principal322 = x509Certificate4.getSubjectX500Principal();
                        publicKey322 = getNextWorkingKey(this.certs, i11);
                        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = getAlgorithmIdentifier(publicKey322);
                        algorithmIdentifier2.getAlgorithm();
                        algorithmIdentifier2.getParameters();
                        size = i11 - 1;
                        x509Certificate622 = x509Certificate4;
                        trustAnchor2 = trustAnchor3;
                        str8 = str7;
                        c2 = 0;
                    }
                } else if (isSelfIssued(x509Certificate7)) {
                    try {
                        org.bouncycastle.x509.CertPathValidatorUtilities.verifyX509Certificate(x509Certificate7, x509Certificate7.getPublicKey(), this.pkixParams.getSigProvider());
                        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                    } catch (java.security.GeneralSecurityException e4) {
                        errorBundle = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.signatureNotVerified", new java.lang.Object[]{e4.getMessage(), e4, e4.getClass().getName()});
                        addError(errorBundle, size);
                        x509Certificate7.checkValidity(this.validDate);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal2 != null) {
                        }
                        if (i10 != this.n) {
                        }
                        c = 5;
                        x500Principal322 = x509Certificate4.getSubjectX500Principal();
                        publicKey322 = getNextWorkingKey(this.certs, i11);
                        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier22 = getAlgorithmIdentifier(publicKey322);
                        algorithmIdentifier22.getAlgorithm();
                        algorithmIdentifier22.getParameters();
                        size = i11 - 1;
                        x509Certificate622 = x509Certificate4;
                        trustAnchor2 = trustAnchor3;
                        str8 = str7;
                        c2 = 0;
                    }
                } else {
                    org.bouncycastle.i18n.ErrorBundle errorBundle3 = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.NoIssuerPublicKey");
                    byte[] extensionValue3 = x509Certificate7.getExtensionValue(org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier.getId());
                    if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = org.bouncycastle.asn1.x509.AuthorityKeyIdentifier.getInstance(org.bouncycastle.asn1.DEROctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                        org.bouncycastle.asn1.x509.GeneralName generalName = authorityCertIssuer.getNames()[c2];
                        java.math.BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                        if (authorityCertSerialNumber != null) {
                            errorBundle3.setExtraArguments(new java.lang.Object[]{new org.bouncycastle.i18n.LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingIssuer"), " \"", generalName, "\" ", new org.bouncycastle.i18n.LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingSerial"), " ", authorityCertSerialNumber});
                        }
                    }
                    addError(errorBundle3, size);
                }
                try {
                    x509Certificate7.checkValidity(this.validDate);
                } catch (java.security.cert.CertificateExpiredException unused5) {
                    errorBundle2 = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certificateExpired", new java.lang.Object[]{new org.bouncycastle.i18n.filter.TrustedInput(x509Certificate7.getNotAfter())});
                    addError(errorBundle2, size);
                    if (this.pkixParams.isRevocationEnabled()) {
                    }
                    if (x500Principal2 != null) {
                    }
                    if (i10 != this.n) {
                    }
                    c = 5;
                    x500Principal322 = x509Certificate4.getSubjectX500Principal();
                    publicKey322 = getNextWorkingKey(this.certs, i11);
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier222 = getAlgorithmIdentifier(publicKey322);
                    algorithmIdentifier222.getAlgorithm();
                    algorithmIdentifier222.getParameters();
                    size = i11 - 1;
                    x509Certificate622 = x509Certificate4;
                    trustAnchor2 = trustAnchor3;
                    str8 = str7;
                    c2 = 0;
                } catch (java.security.cert.CertificateNotYetValidException unused6) {
                    errorBundle2 = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certificateNotYetValid", new java.lang.Object[]{new org.bouncycastle.i18n.filter.TrustedInput(x509Certificate7.getNotBefore())});
                    addError(errorBundle2, size);
                    if (this.pkixParams.isRevocationEnabled()) {
                    }
                    if (x500Principal2 != null) {
                    }
                    if (i10 != this.n) {
                    }
                    c = 5;
                    x500Principal322 = x509Certificate4.getSubjectX500Principal();
                    publicKey322 = getNextWorkingKey(this.certs, i11);
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2222 = getAlgorithmIdentifier(publicKey322);
                    algorithmIdentifier2222.getAlgorithm();
                    algorithmIdentifier2222.getParameters();
                    size = i11 - 1;
                    x509Certificate622 = x509Certificate4;
                    trustAnchor2 = trustAnchor3;
                    str8 = str7;
                    c2 = 0;
                }
                if (this.pkixParams.isRevocationEnabled()) {
                    try {
                        extensionValue2 = getExtensionValue(x509Certificate7, getHighSpeedVideoFpsRangesFor);
                    } catch (org.bouncycastle.jce.provider.AnnotatedException unused7) {
                        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPtExtError"), size);
                    }
                    try {
                        if (extensionValue2 != null) {
                            cRLDistPoint = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(extensionValue2);
                            extensionValue = getExtensionValue(x509Certificate7, Camera2StreamConfigurationMap);
                            if (extensionValue != null) {
                                authorityInformationAccess = org.bouncycastle.asn1.x509.AuthorityInformationAccess.getInstance(extensionValue);
                                java.util.Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                                java.util.Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                                it = cRLDistUrls.iterator();
                                while (it.hasNext()) {
                                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPoint", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedUrlInput(it.next())}), size);
                                }
                                it2 = oCSPUrls.iterator();
                                while (it2.hasNext()) {
                                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ocspLocation", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedUrlInput(it2.next())}), size);
                                }
                                x509Certificate4 = x509Certificate7;
                                str7 = str8;
                                i11 = size;
                                java.security.cert.X509Certificate x509Certificate8 = x509Certificate622;
                                publicKey2 = publicKey322;
                                i10 = i16;
                                x500Principal2 = x500Principal322;
                                trustAnchor3 = trustAnchor2;
                                checkRevocation(this.pkixParams, x509Certificate7, this.validDate, x509Certificate8, publicKey322, cRLDistUrls, oCSPUrls, i11);
                            }
                            authorityInformationAccess = null;
                            java.util.Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                            java.util.Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                            it = cRLDistUrls2.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = oCSPUrls2.iterator();
                            while (it2.hasNext()) {
                            }
                            x509Certificate4 = x509Certificate7;
                            str7 = str8;
                            i11 = size;
                            java.security.cert.X509Certificate x509Certificate82 = x509Certificate622;
                            publicKey2 = publicKey322;
                            i10 = i16;
                            x500Principal2 = x500Principal322;
                            trustAnchor3 = trustAnchor2;
                            checkRevocation(this.pkixParams, x509Certificate7, this.validDate, x509Certificate82, publicKey322, cRLDistUrls2, oCSPUrls2, i11);
                        }
                        checkRevocation(this.pkixParams, x509Certificate7, this.validDate, x509Certificate82, publicKey322, cRLDistUrls2, oCSPUrls2, i11);
                    } catch (org.bouncycastle.x509.CertPathReviewerException e5) {
                        e = e5;
                        addError(e.getErrorMessage(), i11);
                        if (x500Principal2 != null) {
                            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certWrongIssuer", new java.lang.Object[]{x500Principal2.getName(), x509Certificate4.getIssuerX500Principal().getName()}), i11);
                        }
                        if (i10 != this.n) {
                        }
                        c = 5;
                        x500Principal322 = x509Certificate4.getSubjectX500Principal();
                        publicKey322 = getNextWorkingKey(this.certs, i11);
                        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier22222 = getAlgorithmIdentifier(publicKey322);
                        algorithmIdentifier22222.getAlgorithm();
                        algorithmIdentifier22222.getParameters();
                        size = i11 - 1;
                        x509Certificate622 = x509Certificate4;
                        trustAnchor2 = trustAnchor3;
                        str8 = str7;
                        c2 = 0;
                    }
                    cRLDistPoint = null;
                    extensionValue = getExtensionValue(x509Certificate7, Camera2StreamConfigurationMap);
                    if (extensionValue != null) {
                    }
                    authorityInformationAccess = null;
                    java.util.Vector cRLDistUrls22 = getCRLDistUrls(cRLDistPoint);
                    java.util.Vector oCSPUrls22 = getOCSPUrls(authorityInformationAccess);
                    it = cRLDistUrls22.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = oCSPUrls22.iterator();
                    while (it2.hasNext()) {
                    }
                    x509Certificate4 = x509Certificate7;
                    str7 = str8;
                    i11 = size;
                    java.security.cert.X509Certificate x509Certificate822 = x509Certificate622;
                    publicKey2 = publicKey322;
                    i10 = i16;
                    x500Principal2 = x500Principal322;
                    trustAnchor3 = trustAnchor2;
                } else {
                    x509Certificate4 = x509Certificate7;
                    i10 = i16;
                    i11 = size;
                    publicKey2 = publicKey322;
                    trustAnchor3 = trustAnchor2;
                    str7 = str8;
                    x500Principal2 = x500Principal322;
                }
                if (x500Principal2 != null && !x509Certificate4.getIssuerX500Principal().equals(x500Principal2)) {
                    addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certWrongIssuer", new java.lang.Object[]{x500Principal2.getName(), x509Certificate4.getIssuerX500Principal().getName()}), i11);
                }
                if (i10 != this.n) {
                    if (x509Certificate4 != null && x509Certificate4.getVersion() == 1) {
                        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i11);
                    }
                    try {
                        org.bouncycastle.asn1.x509.BasicConstraints basicConstraints2 = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(getExtensionValue(x509Certificate4, BASIC_CONSTRAINTS));
                        if (basicConstraints2 == null) {
                            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBasicConstraints"), i11);
                        } else if (!basicConstraints2.isCA()) {
                            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i11);
                        }
                    } catch (org.bouncycastle.jce.provider.AnnotatedException unused8) {
                        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.errorProcesingBC"), i11);
                    }
                    boolean[] keyUsage2 = x509Certificate4.getKeyUsage();
                    if (keyUsage2 != null) {
                        c = 5;
                        if (keyUsage2.length <= 5 || !keyUsage2[5]) {
                            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCertSign"), i11);
                        }
                        x500Principal322 = x509Certificate4.getSubjectX500Principal();
                        publicKey322 = getNextWorkingKey(this.certs, i11);
                        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier222222 = getAlgorithmIdentifier(publicKey322);
                        algorithmIdentifier222222.getAlgorithm();
                        algorithmIdentifier222222.getParameters();
                        size = i11 - 1;
                        x509Certificate622 = x509Certificate4;
                        trustAnchor2 = trustAnchor3;
                        str8 = str7;
                        c2 = 0;
                    }
                }
                c = 5;
                x500Principal322 = x509Certificate4.getSubjectX500Principal();
                publicKey322 = getNextWorkingKey(this.certs, i11);
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2222222 = getAlgorithmIdentifier(publicKey322);
                algorithmIdentifier2222222.getAlgorithm();
                algorithmIdentifier2222222.getParameters();
                size = i11 - 1;
                x509Certificate622 = x509Certificate4;
                trustAnchor2 = trustAnchor3;
                str8 = str7;
                c2 = 0;
            }
            str = str8;
            this.trustAnchor = trustAnchor2;
            this.subjectPublicKey = publicKey322;
            org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator22 = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator();
            for (size4 = this.certs.size() - 1; size4 > 0; size4--) {
                java.security.cert.X509Certificate x509Certificate9 = (java.security.cert.X509Certificate) this.certs.get(size4);
                if (!isSelfIssued(x509Certificate9)) {
                    javax.security.auth.x500.X500Principal subjectPrincipal = getSubjectPrincipal(x509Certificate9);
                    try {
                        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(new java.io.ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator22.checkPermittedDN(aSN1Sequence2);
                            try {
                                pKIXNameConstraintValidator22.checkExcludedDN(aSN1Sequence2);
                                try {
                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(x509Certificate9, SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence3 != null) {
                                        for (int i17 = 0; i17 < aSN1Sequence3.size(); i17++) {
                                            org.bouncycastle.asn1.x509.GeneralName generalName2 = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence3.getObjectAt(i17));
                                            try {
                                                pKIXNameConstraintValidator22.checkPermitted(generalName2);
                                                pKIXNameConstraintValidator22.checkExcluded(generalName2);
                                            } catch (org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException e6) {
                                                throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notPermittedEmail", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(generalName2)}), e6, this.certPath, size4);
                                            }
                                        }
                                    }
                                } catch (org.bouncycastle.jce.provider.AnnotatedException e7) {
                                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.subjAltNameExtError"), e7, this.certPath, size4);
                                }
                            } catch (org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException e8) {
                                throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.excludedDN", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(subjectPrincipal.getName())}), e8, this.certPath, size4);
                            }
                        } catch (org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException e9) {
                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notPermittedDN", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(subjectPrincipal.getName())}), e9, this.certPath, size4);
                        }
                    } catch (java.io.IOException e10) {
                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ncSubjectNameError", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(subjectPrincipal)}), e10, this.certPath, size4);
                    }
                }
                try {
                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence4 = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(x509Certificate9, NAME_CONSTRAINTS);
                    if (aSN1Sequence4 != null) {
                        org.bouncycastle.asn1.x509.NameConstraints nameConstraints = org.bouncycastle.asn1.x509.NameConstraints.getInstance(aSN1Sequence4);
                        org.bouncycastle.asn1.x509.GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator22.intersectPermittedSubtree(permittedSubtrees);
                        }
                        org.bouncycastle.asn1.x509.GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i18 = 0; i18 != excludedSubtrees.length; i18++) {
                                pKIXNameConstraintValidator22.addExcludedSubtree(excludedSubtrees[i18]);
                            }
                        }
                    }
                } catch (org.bouncycastle.jce.provider.AnnotatedException e11) {
                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ncExtError"), e11, this.certPath, size4);
                }
            }
            int i1422 = this.n;
            int i1522 = 0;
            for (size2 = this.certs.size() - 1; size2 > 0; size2--) {
                java.security.cert.X509Certificate x509Certificate10 = (java.security.cert.X509Certificate) this.certs.get(size2);
                if (!isSelfIssued(x509Certificate10)) {
                    if (i1422 <= 0) {
                        addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pathLengthExtended"));
                    }
                    i1422--;
                    i1522++;
                }
                try {
                    basicConstraints = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(getExtensionValue(x509Certificate10, BASIC_CONSTRAINTS));
                } catch (org.bouncycastle.jce.provider.AnnotatedException unused9) {
                    addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.processLengthConstError"), size2);
                    basicConstraints = null;
                }
                if (basicConstraints != null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (intValue = pathLenConstraint.intValue()) < i1422) {
                    i1422 = intValue;
                }
            }
            addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new java.lang.Object[]{org.bouncycastle.util.Integers.valueOf(i1522)}));
            initialPolicies = this.pkixParams.getInitialPolicies();
            i = this.n + 1;
            java.util.ArrayList[] arrayListArr22 = new java.util.ArrayList[i];
            for (i2 = 0; i2 < i; i2++) {
                arrayListArr22[i2] = new java.util.ArrayList();
            }
            java.util.HashSet hashSet522 = new java.util.HashSet();
            java.lang.String str922 = "2.5.29.32.0";
            hashSet522.add("2.5.29.32.0");
            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode22 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), 0, hashSet522, null, new java.util.HashSet(), "2.5.29.32.0", false);
            arrayListArr22[0].add(pKIXPolicyNode22);
            if (this.pkixParams.isExplicitPolicyRequired()) {
                i3 = 1;
                i4 = this.n + 1;
            } else {
                i4 = 0;
                i3 = 1;
            }
            int i19 = !this.pkixParams.isAnyPolicyInhibited() ? 0 : this.n + i3;
            int i20 = !this.pkixParams.isPolicyMappingInhibited() ? 0 : this.n + i3;
            size3 = this.certs.size() - i3;
            x509Certificate2 = null;
            hashSet = null;
            while (true) {
                java.lang.String str1022 = "CertPathReviewer.policyConstExtError";
                if (size3 >= 0) {
                    break;
                }
                int i21 = this.n - size3;
                x509Certificate3 = (java.security.cert.X509Certificate) this.certs.get(size3);
                i5 = i;
                try {
                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence5 = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(x509Certificate3, CERTIFICATE_POLICIES);
                    java.util.Set<java.lang.String> set = initialPolicies;
                    if (aSN1Sequence5 == null || pKIXPolicyNode22 == null) {
                        str2 = str922;
                        i6 = i19;
                        i7 = i20;
                        str3 = "CertPathReviewer.policyConstExtError";
                        pKIXPolicyNode22 = pKIXPolicyNode22;
                    } else {
                        java.util.Enumeration objects2 = aSN1Sequence5.getObjects();
                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode22;
                        java.util.HashSet hashSet6 = new java.util.HashSet();
                        while (objects2.hasMoreElements()) {
                            org.bouncycastle.asn1.x509.PolicyInformation policyInformation = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(objects2.nextElement());
                            java.lang.String str11 = str1022;
                            org.bouncycastle.asn1.ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            int i22 = i20;
                            hashSet6.add(policyIdentifier.getId());
                            if (!str922.equals(policyIdentifier.getId())) {
                                try {
                                    java.util.Set qualifierSet = getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!processCertD1i(i21, arrayListArr22, policyIdentifier, qualifierSet)) {
                                        processCertD1ii(i21, arrayListArr22, policyIdentifier, qualifierSet);
                                    }
                                } catch (java.security.cert.CertPathValidatorException e12) {
                                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), e12, this.certPath, size3);
                                }
                            }
                            str1022 = str11;
                            i20 = i22;
                        }
                        i7 = i20;
                        str3 = str1022;
                        if (hashSet != null && !hashSet.contains(str922)) {
                            hashSet3 = new java.util.HashSet();
                            for (java.lang.Object obj : hashSet) {
                                if (hashSet6.contains(obj)) {
                                    hashSet3.add(obj);
                                }
                            }
                            if (i19 <= 0) {
                                if (i21 < this.n && isSelfIssued(x509Certificate3)) {
                                }
                                str2 = str922;
                                i6 = i19;
                                hashSet4 = hashSet3;
                                pKIXPolicyNode22 = pKIXPolicyNode3;
                                for (i8 = i21 - 1; i8 >= 0; i8--) {
                                    java.util.ArrayList arrayList = arrayListArr22[i8];
                                    while (i9 < arrayList.size()) {
                                        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode4 = (org.bouncycastle.jce.provider.PKIXPolicyNode) arrayList.get(i9);
                                        i9 = (pKIXPolicyNode4.hasChildren() || (pKIXPolicyNode22 = removePolicyNode(pKIXPolicyNode22, arrayListArr22, pKIXPolicyNode4)) != null) ? i9 + 1 : 0;
                                    }
                                }
                                criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs != null) {
                                    boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                                    java.util.ArrayList arrayList2 = arrayListArr22[i21];
                                    for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                                        ((org.bouncycastle.jce.provider.PKIXPolicyNode) arrayList2.get(i23)).setCritical(contains);
                                    }
                                }
                                hashSet = hashSet4;
                            }
                            objects = aSN1Sequence5.getObjects();
                            while (objects.hasMoreElements()) {
                                org.bouncycastle.asn1.x509.PolicyInformation policyInformation2 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(objects.nextElement());
                                if (str922.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        java.util.Set qualifierSet2 = getQualifierSet(policyInformation2.getPolicyQualifiers());
                                        java.util.ArrayList arrayList3 = arrayListArr22[i21 - 1];
                                        hashSet4 = hashSet3;
                                        for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                                            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode5 = (org.bouncycastle.jce.provider.PKIXPolicyNode) arrayList3.get(i24);
                                            for (java.lang.Object obj2 : pKIXPolicyNode5.getExpectedPolicies()) {
                                                java.util.ArrayList arrayList4 = arrayList3;
                                                int i25 = i19;
                                                if (obj2 instanceof java.lang.String) {
                                                    id = (java.lang.String) obj2;
                                                } else {
                                                    if (obj2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                                                        id = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) obj2).getId();
                                                    }
                                                    str6 = str922;
                                                    arrayList3 = arrayList4;
                                                    i19 = i25;
                                                    str922 = str6;
                                                }
                                                java.util.Iterator children = pKIXPolicyNode5.getChildren();
                                                boolean z = false;
                                                while (children.hasNext()) {
                                                    java.util.Iterator it3 = children;
                                                    if (id.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                        z = true;
                                                    }
                                                    children = it3;
                                                }
                                                if (!z) {
                                                    java.util.HashSet hashSet7 = new java.util.HashSet();
                                                    hashSet7.add(id);
                                                    str6 = str922;
                                                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode6 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), i21, hashSet7, pKIXPolicyNode5, qualifierSet2, id, false);
                                                    pKIXPolicyNode5.addChild(pKIXPolicyNode6);
                                                    arrayListArr22[i21].add(pKIXPolicyNode6);
                                                    arrayList3 = arrayList4;
                                                    i19 = i25;
                                                    str922 = str6;
                                                }
                                                str6 = str922;
                                                arrayList3 = arrayList4;
                                                i19 = i25;
                                                str922 = str6;
                                            }
                                        }
                                        str2 = str922;
                                        i6 = i19;
                                        pKIXPolicyNode22 = pKIXPolicyNode3;
                                        while (i8 >= 0) {
                                        }
                                        criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                        }
                                        hashSet = hashSet4;
                                    } catch (java.security.cert.CertPathValidatorException e13) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), e13, this.certPath, size3);
                                    }
                                }
                            }
                            str2 = str922;
                            i6 = i19;
                            hashSet4 = hashSet3;
                            pKIXPolicyNode22 = pKIXPolicyNode3;
                            while (i8 >= 0) {
                            }
                            criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                            }
                            hashSet = hashSet4;
                        }
                        hashSet3 = hashSet6;
                        if (i19 <= 0) {
                        }
                        objects = aSN1Sequence5.getObjects();
                        while (objects.hasMoreElements()) {
                        }
                        str2 = str922;
                        i6 = i19;
                        hashSet4 = hashSet3;
                        pKIXPolicyNode22 = pKIXPolicyNode3;
                        while (i8 >= 0) {
                        }
                        criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                        }
                        hashSet = hashSet4;
                    }
                    if (aSN1Sequence5 == null) {
                        pKIXPolicyNode22 = null;
                    }
                    if (i4 <= 0 && pKIXPolicyNode22 == null) {
                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i21 != this.n) {
                        try {
                            org.bouncycastle.asn1.ASN1Primitive extensionValue4 = getExtensionValue(x509Certificate3, POLICY_MAPPINGS);
                            if (extensionValue4 != null) {
                                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence6 = (org.bouncycastle.asn1.ASN1Sequence) extensionValue4;
                                int i26 = 0;
                                while (i26 < aSN1Sequence6.size()) {
                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence7 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence6.getObjectAt(i26);
                                    org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence7.getObjectAt(0);
                                    org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence7.getObjectAt(1);
                                    java.lang.String id2 = aSN1ObjectIdentifier.getId();
                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence8 = aSN1Sequence6;
                                    java.lang.String str12 = str2;
                                    org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNode22;
                                    if (str12.equals(id2)) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicyMapping"), this.certPath, size3);
                                    }
                                    if (str12.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicyMapping"), this.certPath, size3);
                                    }
                                    i26++;
                                    str2 = str12;
                                    aSN1Sequence6 = aSN1Sequence8;
                                    pKIXPolicyNode22 = pKIXPolicyNode7;
                                }
                            }
                            org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode8 = pKIXPolicyNode22;
                            str922 = str2;
                            if (extensionValue4 != null) {
                                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence9 = (org.bouncycastle.asn1.ASN1Sequence) extensionValue4;
                                java.util.HashMap hashMap = new java.util.HashMap();
                                java.util.HashSet<java.lang.String> hashSet8 = new java.util.HashSet();
                                int i27 = 0;
                                while (i27 < aSN1Sequence9.size()) {
                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence10 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence9.getObjectAt(i27);
                                    org.bouncycastle.asn1.ASN1Sequence aSN1Sequence11 = aSN1Sequence9;
                                    java.lang.String id3 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence10.getObjectAt(0)).getId();
                                    java.util.HashSet hashSet9 = hashSet;
                                    java.lang.String id4 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence10.getObjectAt(1)).getId();
                                    if (hashMap.containsKey(id3)) {
                                        ((java.util.Set) hashMap.get(id3)).add(id4);
                                    } else {
                                        java.util.HashSet hashSet10 = new java.util.HashSet();
                                        hashSet10.add(id4);
                                        hashMap.put(id3, hashSet10);
                                        hashSet8.add(id3);
                                    }
                                    i27++;
                                    aSN1Sequence9 = aSN1Sequence11;
                                    hashSet = hashSet9;
                                }
                                hashSet2 = hashSet;
                                org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode9 = pKIXPolicyNode8;
                                for (java.lang.String str13 : hashSet8) {
                                    if (i7 > 0) {
                                        try {
                                            prepareNextCertB1(i21, arrayListArr22, str13, hashMap, x509Certificate3);
                                            str5 = str;
                                        } catch (java.security.cert.CertPathValidatorException e14) {
                                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), e14, this.certPath, size3);
                                        } catch (org.bouncycastle.jce.provider.AnnotatedException e15) {
                                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", str), e15, this.certPath, size3);
                                        }
                                    } else {
                                        str5 = str;
                                        if (i7 <= 0) {
                                            pKIXPolicyNode9 = prepareNextCertB2(i21, arrayListArr22, str13, pKIXPolicyNode9);
                                        }
                                    }
                                    str = str5;
                                }
                                str4 = str;
                                pKIXPolicyNode22 = pKIXPolicyNode9;
                            } else {
                                hashSet2 = hashSet;
                                str4 = str;
                                pKIXPolicyNode22 = pKIXPolicyNode8;
                            }
                            try {
                                try {
                                    if (isSelfIssued(x509Certificate3)) {
                                        i20 = i7;
                                    } else {
                                        if (i4 != 0) {
                                            i4--;
                                        }
                                        i20 = i7 != 0 ? i7 - 1 : i7;
                                        if (i6 != 0) {
                                            i19 = i6 - 1;
                                            aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(x509Certificate3, POLICY_CONSTRAINTS);
                                            if (aSN1Sequence != null) {
                                                java.util.Enumeration objects3 = aSN1Sequence.getObjects();
                                                while (objects3.hasMoreElements()) {
                                                    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects3.nextElement();
                                                    int tagNo = aSN1TaggedObject.getTagNo();
                                                    if (tagNo == 0) {
                                                        int intValueExact3 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                                        if (intValueExact3 < i4) {
                                                            i4 = intValueExact3;
                                                        }
                                                    } else if (tagNo == 1 && (intValueExact2 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i20) {
                                                        i20 = intValueExact2;
                                                    }
                                                }
                                            }
                                            aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) getExtensionValue(x509Certificate3, INHIBIT_ANY_POLICY);
                                            if (aSN1Integer != null && (intValueExact = aSN1Integer.intValueExact()) < i19) {
                                                i19 = intValueExact;
                                            }
                                        }
                                    }
                                    aSN1Integer = (org.bouncycastle.asn1.ASN1Integer) getExtensionValue(x509Certificate3, INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null) {
                                        i19 = intValueExact;
                                    }
                                } catch (org.bouncycastle.jce.provider.AnnotatedException unused10) {
                                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyInhibitExtError"), this.certPath, size3);
                                }
                                aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(x509Certificate3, POLICY_CONSTRAINTS);
                                if (aSN1Sequence != null) {
                                }
                            } catch (org.bouncycastle.jce.provider.AnnotatedException unused11) {
                                throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", str3), this.certPath, size3);
                            }
                            i19 = i6;
                        } catch (org.bouncycastle.jce.provider.AnnotatedException e16) {
                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyMapExtError"), e16, this.certPath, size3);
                        }
                    } else {
                        hashSet2 = hashSet;
                        str4 = str;
                        str922 = str2;
                        i20 = i7;
                        i19 = i6;
                    }
                    size3--;
                    str = str4;
                    x509Certificate2 = x509Certificate3;
                    i = i5;
                    initialPolicies = set;
                    hashSet = hashSet2;
                } catch (org.bouncycastle.jce.provider.AnnotatedException e17) {
                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", str), e17, this.certPath, size3);
                }
                addError(e.getErrorMessage(), e.getIndex());
            }
        }
        trustAnchor2 = null;
        if (trustAnchor2 == null) {
        }
        if (trustAnchor2 == null) {
        }
        java.security.cert.X509Certificate x509Certificate6222 = x509Certificate;
        javax.security.auth.x500.X500Principal x500Principal3222 = x500Principal;
        java.security.PublicKey publicKey3222 = publicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
        }
        str = str8;
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = publicKey3222;
        org.bouncycastle.jce.provider.PKIXNameConstraintValidator pKIXNameConstraintValidator222 = new org.bouncycastle.jce.provider.PKIXNameConstraintValidator();
        while (size4 > 0) {
        }
        int i14222 = this.n;
        int i15222 = 0;
        while (size2 > 0) {
        }
        addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new java.lang.Object[]{org.bouncycastle.util.Integers.valueOf(i15222)}));
        initialPolicies = this.pkixParams.getInitialPolicies();
        i = this.n + 1;
        java.util.ArrayList[] arrayListArr222 = new java.util.ArrayList[i];
        while (i2 < i) {
        }
        java.util.HashSet hashSet5222 = new java.util.HashSet();
        java.lang.String str9222 = "2.5.29.32.0";
        hashSet5222.add("2.5.29.32.0");
        org.bouncycastle.jce.provider.PKIXPolicyNode pKIXPolicyNode222 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), 0, hashSet5222, null, new java.util.HashSet(), "2.5.29.32.0", false);
        arrayListArr222[0].add(pKIXPolicyNode222);
        if (this.pkixParams.isExplicitPolicyRequired()) {
        }
        if (!this.pkixParams.isAnyPolicyInhibited()) {
        }
        if (!this.pkixParams.isPolicyMappingInhibited()) {
        }
        size3 = this.certs.size() - i3;
        x509Certificate2 = null;
        hashSet = null;
        while (true) {
            java.lang.String str10222 = "CertPathReviewer.policyConstExtError";
            if (size3 >= 0) {
            }
            addError(e.getErrorMessage(), e.getIndex());
            size3--;
            str = str4;
            x509Certificate2 = x509Certificate3;
            i = i5;
            initialPolicies = set;
            hashSet = hashSet2;
        }
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            java.util.List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }

    public void init(java.security.cert.CertPath certPath, java.security.cert.PKIXParameters pKIXParameters) throws org.bouncycastle.x509.CertPathReviewerException {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("object is already initialized!");
        }
        this.getHighSpeedVideoSizes = true;
        if (certPath == null) {
            throw new java.lang.NullPointerException("certPath was null");
        }
        this.certPath = certPath;
        java.util.List<? extends java.security.cert.Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (java.security.cert.PKIXParameters) pKIXParameters.clone();
        java.util.Date date = new java.util.Date();
        this.currentDate = date;
        this.validDate = getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    protected java.util.Collection getTrustAnchors(java.security.cert.X509Certificate x509Certificate, java.util.Set set) throws org.bouncycastle.x509.CertPathReviewerException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
        try {
            x509CertSelector.setSubject(getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                org.bouncycastle.asn1.x509.AuthorityKeyIdentifier authorityKeyIdentifier = org.bouncycastle.asn1.x509.AuthorityKeyIdentifier.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                }
            }
            while (it.hasNext()) {
                java.security.cert.TrustAnchor trustAnchor = (java.security.cert.TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && getEncodedIssuerPrincipal(x509Certificate).equals(new javax.security.auth.x500.X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (java.io.IOException unused) {
            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public java.security.cert.TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public java.security.PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public java.security.cert.PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    protected java.util.Vector getOCSPUrls(org.bouncycastle.asn1.x509.AuthorityInformationAccess authorityInformationAccess) {
        java.util.Vector vector = new java.util.Vector();
        if (authorityInformationAccess != null) {
            org.bouncycastle.asn1.x509.AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x509.AccessDescription.id_ad_ocsp)) {
                    org.bouncycastle.asn1.x509.GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((org.bouncycastle.asn1.ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public java.util.List[] getNotifications() {
        doChecks();
        return this.notifications;
    }

    public java.util.List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public java.util.List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public java.util.List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public int getCertPathSize() {
        return this.n;
    }

    public java.security.cert.CertPath getCertPath() {
        return this.certPath;
    }

    protected java.util.Vector getCRLDistUrls(org.bouncycastle.asn1.x509.CRLDistPoint cRLDistPoint) {
        java.util.Vector vector = new java.util.Vector();
        if (cRLDistPoint != null) {
            for (org.bouncycastle.asn1.x509.DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                org.bouncycastle.asn1.x509.DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    org.bouncycastle.asn1.x509.GeneralName[] names = org.bouncycastle.asn1.x509.GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((org.bouncycastle.asn1.ASN1IA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    protected void checkRevocation(java.security.cert.PKIXParameters pKIXParameters, java.security.cert.X509Certificate x509Certificate, java.util.Date date, java.security.cert.X509Certificate x509Certificate2, java.security.PublicKey publicKey, java.util.Vector vector, java.util.Vector vector2, int i) throws org.bouncycastle.x509.CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void checkCRLs(java.security.cert.PKIXParameters pKIXParameters, java.security.cert.X509Certificate x509Certificate, java.util.Date date, java.security.cert.X509Certificate x509Certificate2, java.security.PublicKey publicKey, java.util.Vector vector, int i) throws org.bouncycastle.x509.CertPathReviewerException {
        java.util.Iterator it;
        java.security.cert.X509CRL x509crl;
        boolean z;
        boolean z2;
        java.lang.String str;
        boolean[] keyUsage;
        java.security.cert.X509CRL x509crl2;
        java.util.Iterator it2;
        boolean z3;
        org.bouncycastle.i18n.ErrorBundle errorBundle;
        org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector = new org.bouncycastle.x509.X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                java.util.Set highSpeedVideoSizes = org.bouncycastle.x509.PKIXCRLUtil.getHighSpeedVideoSizes(x509CRLStoreSelector, pKIXParameters);
                it = highSpeedVideoSizes.iterator();
                if (highSpeedVideoSizes.isEmpty()) {
                    java.util.Iterator it3 = org.bouncycastle.x509.PKIXCRLUtil.getHighSpeedVideoSizes(new org.bouncycastle.x509.X509CRLStoreSelector(), pKIXParameters).iterator();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (it3.hasNext()) {
                        arrayList.add(((java.security.cert.X509CRL) it3.next()).getIssuerX500Principal());
                    }
                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCrlInCertstore", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new org.bouncycastle.i18n.filter.UntrustedInput(arrayList), org.bouncycastle.util.Integers.valueOf(arrayList.size())}), i);
                }
            } catch (org.bouncycastle.jce.provider.AnnotatedException e) {
                addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlExtractionError", new java.lang.Object[]{e.getCause().getMessage(), e.getCause(), e.getCause().getClass().getName()}), i);
                it = new java.util.ArrayList().iterator();
            }
            java.security.cert.X509CRL x509crl3 = null;
            while (it.hasNext()) {
                x509crl3 = (java.security.cert.X509CRL) it.next();
                java.util.Date thisUpdate = x509crl3.getThisUpdate();
                java.util.Date nextUpdate = x509crl3.getNextUpdate();
                java.lang.Object[] objArr = {new org.bouncycastle.i18n.filter.TrustedInput(thisUpdate), new org.bouncycastle.i18n.filter.TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(nextUpdate)) {
                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.localValidCRL", objArr), i);
                    x509crl = x509crl3;
                    z = true;
                    break;
                }
                addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.localInvalidCRL", objArr), i);
            }
            x509crl = x509crl3;
            z = false;
            if (!z) {
                javax.security.auth.x500.X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                java.util.Iterator it4 = vector.iterator();
                boolean z4 = z;
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = z4;
                        break;
                    }
                    try {
                        java.lang.String str2 = (java.lang.String) it4.next();
                        java.security.cert.X509CRL highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str2);
                        if (highResolutionOutputSizeshNQ4ISI != null) {
                            javax.security.auth.x500.X500Principal issuerX500Principal2 = highResolutionOutputSizeshNQ4ISI.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                x509crl2 = x509crl;
                                it2 = it4;
                                z3 = z4;
                                java.util.Date thisUpdate2 = highResolutionOutputSizeshNQ4ISI.getThisUpdate();
                                java.util.Date nextUpdate2 = highResolutionOutputSizeshNQ4ISI.getNextUpdate();
                                java.lang.Object[] objArr2 = {new org.bouncycastle.i18n.filter.TrustedInput(thisUpdate2), new org.bouncycastle.i18n.filter.TrustedInput(nextUpdate2), new org.bouncycastle.i18n.filter.UntrustedUrlInput(str2)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    errorBundle = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineValidCRL", objArr2), i);
                                    x509crl = highResolutionOutputSizeshNQ4ISI;
                                    z2 = true;
                                    break;
                                } catch (org.bouncycastle.x509.CertPathReviewerException e2) {
                                    e = e2;
                                    z4 = true;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                            } else {
                                x509crl2 = x509crl;
                                try {
                                    it2 = it4;
                                } catch (org.bouncycastle.x509.CertPathReviewerException e3) {
                                    e = e3;
                                    it2 = it4;
                                    z3 = z4;
                                    z4 = z3;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                                try {
                                    z3 = z4;
                                } catch (org.bouncycastle.x509.CertPathReviewerException e4) {
                                    e = e4;
                                    z3 = z4;
                                    z4 = z3;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                                try {
                                    errorBundle = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineCRLWrongCA", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(issuerX500Principal2.getName()), new org.bouncycastle.i18n.filter.UntrustedInput(issuerX500Principal.getName()), new org.bouncycastle.i18n.filter.UntrustedUrlInput(str2)});
                                } catch (org.bouncycastle.x509.CertPathReviewerException e5) {
                                    e = e5;
                                    z4 = z3;
                                    addNotification(e.getErrorMessage(), i);
                                    it4 = it2;
                                    x509crl = x509crl2;
                                }
                            }
                            addNotification(errorBundle, i);
                        } else {
                            x509crl2 = x509crl;
                            it2 = it4;
                            z3 = z4;
                        }
                        it4 = it2;
                        x509crl = x509crl2;
                        z4 = z3;
                    } catch (org.bouncycastle.x509.CertPathReviewerException e6) {
                        e = e6;
                        x509crl2 = x509crl;
                    }
                }
            } else {
                z2 = z;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
                    java.security.cert.X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated = org.bouncycastle.asn1.ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, org.bouncycastle.asn1.x509.Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str = crlReasons[aSN1Enumerated.intValueExact()];
                                    if (str == null) {
                                        str = crlReasons[7];
                                    }
                                    org.bouncycastle.i18n.LocaleString localeString = new org.bouncycastle.i18n.LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", str);
                                    if (date.before(revokedCertificate.getRevocationDate())) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certRevoked", new java.lang.Object[]{new org.bouncycastle.i18n.filter.TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                                    }
                                    addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.revokedAfterValidation", new java.lang.Object[]{new org.bouncycastle.i18n.filter.TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i);
                                }
                            } catch (org.bouncycastle.jce.provider.AnnotatedException e7) {
                                throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlReasonExtError"), e7);
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                        org.bouncycastle.i18n.LocaleString localeString2 = new org.bouncycastle.i18n.LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", str);
                        if (date.before(revokedCertificate.getRevocationDate())) {
                        }
                    } else {
                        addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notRevoked"), i);
                    }
                    java.util.Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlUpdateAvailable", new java.lang.Object[]{new org.bouncycastle.i18n.filter.TrustedInput(nextUpdate3)}), i);
                    }
                    try {
                        org.bouncycastle.asn1.ASN1Primitive extensionValue = getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
                        try {
                            org.bouncycastle.asn1.ASN1Primitive extensionValue2 = getExtensionValue(x509crl, DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector2 = new org.bouncycastle.x509.X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(getIssuerPrincipal(x509crl).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((org.bouncycastle.asn1.ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((org.bouncycastle.asn1.ASN1Integer) getExtensionValue(x509crl, CRL_NUMBER)).getPositiveValue().subtract(java.math.BigInteger.valueOf(1L)));
                                        try {
                                            java.util.Iterator it5 = org.bouncycastle.x509.PKIXCRLUtil.getHighSpeedVideoSizes(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it5.hasNext()) {
                                                try {
                                                    if (org.bouncycastle.util.Objects.areEqual(extensionValue, getExtensionValue((java.security.cert.X509CRL) it5.next(), ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (org.bouncycastle.jce.provider.AnnotatedException e8) {
                                                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.distrPtExtError"), e8);
                                                }
                                            }
                                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBaseCRL"));
                                        } catch (org.bouncycastle.jce.provider.AnnotatedException e9) {
                                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlExtractionError"), e9);
                                        }
                                    } catch (org.bouncycastle.jce.provider.AnnotatedException e10) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlNbrExtError"), e10);
                                    }
                                } catch (java.io.IOException e11) {
                                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlIssuerException"), e11);
                                }
                            }
                            if (extensionValue != null) {
                                org.bouncycastle.asn1.x509.IssuingDistributionPoint issuingDistributionPoint = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    org.bouncycastle.asn1.x509.BasicConstraints basicConstraints = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(getExtensionValue(x509Certificate, BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (org.bouncycastle.jce.provider.AnnotatedException e12) {
                                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlBCExtError"), e12);
                                }
                            }
                        } catch (org.bouncycastle.jce.provider.AnnotatedException unused) {
                            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (org.bouncycastle.jce.provider.AnnotatedException unused2) {
                        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.distrPtExtError"));
                    }
                } catch (java.lang.Exception e13) {
                    throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlVerifyFailed"), e13);
                }
            }
            if (!z2) {
                throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noValidCrlFound"));
            }
        } catch (java.io.IOException e14) {
            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlIssuerException"), e14);
        }
    }

    protected void addNotification(org.bouncycastle.i18n.ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    protected void addNotification(org.bouncycastle.i18n.ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    protected void addError(org.bouncycastle.i18n.ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    protected void addError(org.bouncycastle.i18n.ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    private boolean getHighSpeedVideoSizes(java.security.cert.X509Certificate x509Certificate, int i) {
        org.bouncycastle.i18n.ErrorBundle errorBundle;
        try {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) getExtensionValue(x509Certificate, getHighSpeedVideoFpsRanges);
            boolean z = false;
            for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                org.bouncycastle.asn1.x509.qualified.QCStatement qCStatement = org.bouncycastle.asn1.x509.qualified.QCStatement.getInstance(aSN1Sequence.getObjectAt(i2));
                if (org.bouncycastle.asn1.x509.qualified.QCStatement.id_etsi_qcs_QcCompliance.equals((org.bouncycastle.asn1.ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!org.bouncycastle.asn1.x509.qualified.QCStatement.id_qcs_pkixQCSyntax_v1.equals((org.bouncycastle.asn1.ASN1Primitive) qCStatement.getStatementId())) {
                        if (org.bouncycastle.asn1.x509.qualified.QCStatement.id_etsi_qcs_QcSSCD.equals((org.bouncycastle.asn1.ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcSSCD");
                        } else if (org.bouncycastle.asn1.x509.qualified.QCStatement.id_etsi_qcs_LimiteValue.equals((org.bouncycastle.asn1.ASN1Primitive) qCStatement.getStatementId())) {
                            org.bouncycastle.asn1.x509.qualified.MonetaryValue monetaryValue = org.bouncycastle.asn1.x509.qualified.MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double doubleValue = monetaryValue.getAmount().doubleValue() * java.lang.Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcLimitValueAlpha", new java.lang.Object[]{monetaryValue.getCurrency().getAlphabetic(), new org.bouncycastle.i18n.filter.TrustedInput(new java.lang.Double(doubleValue)), monetaryValue}) : new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcLimitValueNum", new java.lang.Object[]{org.bouncycastle.util.Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new org.bouncycastle.i18n.filter.TrustedInput(new java.lang.Double(doubleValue)), monetaryValue}), i);
                        } else {
                            addNotification(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcUnknownStatement", new java.lang.Object[]{qCStatement.getStatementId(), new org.bouncycastle.i18n.filter.UntrustedInput(qCStatement)}), i);
                            z = true;
                        }
                    }
                }
                addNotification(errorBundle, i);
            }
            return !z;
        } catch (org.bouncycastle.jce.provider.AnnotatedException unused) {
            addError(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
    }

    private static java.security.cert.X509CRL getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws org.bouncycastle.x509.CertPathReviewerException {
        try {
            java.net.URL url = new java.net.URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (java.security.cert.X509CRL) java.security.cert.CertificateFactory.getInstance("X.509", org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new java.lang.Exception(httpURLConnection.getResponseMessage());
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.loadCrlDistPointError", new java.lang.Object[]{new org.bouncycastle.i18n.filter.UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    public PKIXCertPathReviewer(java.security.cert.CertPath certPath, java.security.cert.PKIXParameters pKIXParameters) throws org.bouncycastle.x509.CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    public PKIXCertPathReviewer() {
    }
}
