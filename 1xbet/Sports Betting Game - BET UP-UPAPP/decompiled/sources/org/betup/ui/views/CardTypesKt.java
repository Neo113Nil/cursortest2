package org.betup.ui.views;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.Hc;
import kotlin.Metadata;

/* compiled from: CardTypes.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"getCardValueTypeByNumber", "Lorg/betup/ui/views/CardValue;", "value", "", "getSuiteTypeByNumber", "Lorg/betup/ui/views/CardSuite;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardTypesKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final CardValue getCardValueTypeByNumber(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            switch (hashCode) {
                case 50:
                    if (str.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                        return CardValue.TWO;
                    }
                    break;
                case 51:
                    if (str.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                        return CardValue.THREE;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return CardValue.FOUR;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return CardValue.FIVE;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        return CardValue.SIX;
                    }
                    break;
                case 55:
                    if (str.equals(Hc.e)) {
                        return CardValue.SEVEN;
                    }
                    break;
                case 56:
                    if (str.equals("8")) {
                        return CardValue.EIGHT;
                    }
                    break;
                case 57:
                    if (str.equals("9")) {
                        return CardValue.NINE;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1567:
                            if (str.equals("10")) {
                                return CardValue.TEN;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                return CardValue.JACK;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                return CardValue.QUEEN;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                return CardValue.KING;
                            }
                            break;
                    }
            }
        }
        return CardValue.ACE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final CardSuite getSuiteTypeByNumber(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (str.equals("0")) {
                        return CardSuite.SPADES;
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        return CardSuite.CLUBS;
                    }
                    break;
                case 50:
                    if (str.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                        return CardSuite.DIAMONDS;
                    }
                    break;
            }
        }
        return CardSuite.HEARTS;
    }
}
