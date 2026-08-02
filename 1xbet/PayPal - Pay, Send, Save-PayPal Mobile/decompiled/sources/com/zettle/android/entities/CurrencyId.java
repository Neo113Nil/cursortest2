package com.zettle.android.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0003\b»\u0001\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001"}, d2 = {"Lcom/zettle/android/entities/CurrencyId;", "", "<init>", "(Ljava/lang/String;I)V", "AED", "AFA", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZM", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CSD", "CUC", "CUP", "CVE", "CYP", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "FJD", "FKP", "GBP", "GEL", "GGP", "GHC", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZM", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDD", "SDG", "SEK", "SGD", "SHP", "SIT", "SKK", "SLL", "SOS", "SPL", "SRD", "SSP", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMM", "TMT", "TND", "TOP", "TRL", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEB", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWD", "ZWL"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyId {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.zettle.android.entities.CurrencyId[] $VALUES;
    public static final com.zettle.android.entities.CurrencyId AED = new com.zettle.android.entities.CurrencyId("AED", 0);
    public static final com.zettle.android.entities.CurrencyId AFA = new com.zettle.android.entities.CurrencyId("AFA", 1);
    public static final com.zettle.android.entities.CurrencyId AFN = new com.zettle.android.entities.CurrencyId("AFN", 2);
    public static final com.zettle.android.entities.CurrencyId ALL = new com.zettle.android.entities.CurrencyId("ALL", 3);
    public static final com.zettle.android.entities.CurrencyId AMD = new com.zettle.android.entities.CurrencyId("AMD", 4);
    public static final com.zettle.android.entities.CurrencyId ANG = new com.zettle.android.entities.CurrencyId("ANG", 5);
    public static final com.zettle.android.entities.CurrencyId AOA = new com.zettle.android.entities.CurrencyId("AOA", 6);
    public static final com.zettle.android.entities.CurrencyId ARS = new com.zettle.android.entities.CurrencyId("ARS", 7);
    public static final com.zettle.android.entities.CurrencyId AUD = new com.zettle.android.entities.CurrencyId("AUD", 8);
    public static final com.zettle.android.entities.CurrencyId AWG = new com.zettle.android.entities.CurrencyId("AWG", 9);
    public static final com.zettle.android.entities.CurrencyId AZM = new com.zettle.android.entities.CurrencyId("AZM", 10);
    public static final com.zettle.android.entities.CurrencyId AZN = new com.zettle.android.entities.CurrencyId("AZN", 11);
    public static final com.zettle.android.entities.CurrencyId BAM = new com.zettle.android.entities.CurrencyId("BAM", 12);
    public static final com.zettle.android.entities.CurrencyId BBD = new com.zettle.android.entities.CurrencyId("BBD", 13);
    public static final com.zettle.android.entities.CurrencyId BDT = new com.zettle.android.entities.CurrencyId("BDT", 14);
    public static final com.zettle.android.entities.CurrencyId BGN = new com.zettle.android.entities.CurrencyId("BGN", 15);
    public static final com.zettle.android.entities.CurrencyId BHD = new com.zettle.android.entities.CurrencyId("BHD", 16);
    public static final com.zettle.android.entities.CurrencyId BIF = new com.zettle.android.entities.CurrencyId("BIF", 17);
    public static final com.zettle.android.entities.CurrencyId BMD = new com.zettle.android.entities.CurrencyId("BMD", 18);
    public static final com.zettle.android.entities.CurrencyId BND = new com.zettle.android.entities.CurrencyId("BND", 19);
    public static final com.zettle.android.entities.CurrencyId BOB = new com.zettle.android.entities.CurrencyId("BOB", 20);
    public static final com.zettle.android.entities.CurrencyId BRL = new com.zettle.android.entities.CurrencyId("BRL", 21);
    public static final com.zettle.android.entities.CurrencyId BSD = new com.zettle.android.entities.CurrencyId("BSD", 22);
    public static final com.zettle.android.entities.CurrencyId BTN = new com.zettle.android.entities.CurrencyId("BTN", 23);
    public static final com.zettle.android.entities.CurrencyId BWP = new com.zettle.android.entities.CurrencyId("BWP", 24);
    public static final com.zettle.android.entities.CurrencyId BYR = new com.zettle.android.entities.CurrencyId("BYR", 25);
    public static final com.zettle.android.entities.CurrencyId BZD = new com.zettle.android.entities.CurrencyId("BZD", 26);
    public static final com.zettle.android.entities.CurrencyId CAD = new com.zettle.android.entities.CurrencyId("CAD", 27);
    public static final com.zettle.android.entities.CurrencyId CDF = new com.zettle.android.entities.CurrencyId("CDF", 28);
    public static final com.zettle.android.entities.CurrencyId CHF = new com.zettle.android.entities.CurrencyId("CHF", 29);
    public static final com.zettle.android.entities.CurrencyId CLP = new com.zettle.android.entities.CurrencyId("CLP", 30);
    public static final com.zettle.android.entities.CurrencyId CNY = new com.zettle.android.entities.CurrencyId("CNY", 31);
    public static final com.zettle.android.entities.CurrencyId COP = new com.zettle.android.entities.CurrencyId("COP", 32);
    public static final com.zettle.android.entities.CurrencyId CRC = new com.zettle.android.entities.CurrencyId("CRC", 33);
    public static final com.zettle.android.entities.CurrencyId CSD = new com.zettle.android.entities.CurrencyId("CSD", 34);
    public static final com.zettle.android.entities.CurrencyId CUC = new com.zettle.android.entities.CurrencyId("CUC", 35);
    public static final com.zettle.android.entities.CurrencyId CUP = new com.zettle.android.entities.CurrencyId("CUP", 36);
    public static final com.zettle.android.entities.CurrencyId CVE = new com.zettle.android.entities.CurrencyId("CVE", 37);
    public static final com.zettle.android.entities.CurrencyId CYP = new com.zettle.android.entities.CurrencyId("CYP", 38);
    public static final com.zettle.android.entities.CurrencyId CZK = new com.zettle.android.entities.CurrencyId("CZK", 39);
    public static final com.zettle.android.entities.CurrencyId DJF = new com.zettle.android.entities.CurrencyId("DJF", 40);
    public static final com.zettle.android.entities.CurrencyId DKK = new com.zettle.android.entities.CurrencyId("DKK", 41);
    public static final com.zettle.android.entities.CurrencyId DOP = new com.zettle.android.entities.CurrencyId("DOP", 42);
    public static final com.zettle.android.entities.CurrencyId DZD = new com.zettle.android.entities.CurrencyId("DZD", 43);
    public static final com.zettle.android.entities.CurrencyId EEK = new com.zettle.android.entities.CurrencyId("EEK", 44);
    public static final com.zettle.android.entities.CurrencyId EGP = new com.zettle.android.entities.CurrencyId("EGP", 45);
    public static final com.zettle.android.entities.CurrencyId ERN = new com.zettle.android.entities.CurrencyId("ERN", 46);
    public static final com.zettle.android.entities.CurrencyId ETB = new com.zettle.android.entities.CurrencyId("ETB", 47);
    public static final com.zettle.android.entities.CurrencyId EUR = new com.zettle.android.entities.CurrencyId(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, 48);
    public static final com.zettle.android.entities.CurrencyId FJD = new com.zettle.android.entities.CurrencyId("FJD", 49);
    public static final com.zettle.android.entities.CurrencyId FKP = new com.zettle.android.entities.CurrencyId("FKP", 50);
    public static final com.zettle.android.entities.CurrencyId GBP = new com.zettle.android.entities.CurrencyId("GBP", 51);
    public static final com.zettle.android.entities.CurrencyId GEL = new com.zettle.android.entities.CurrencyId("GEL", 52);
    public static final com.zettle.android.entities.CurrencyId GGP = new com.zettle.android.entities.CurrencyId("GGP", 53);
    public static final com.zettle.android.entities.CurrencyId GHC = new com.zettle.android.entities.CurrencyId("GHC", 54);
    public static final com.zettle.android.entities.CurrencyId GHS = new com.zettle.android.entities.CurrencyId("GHS", 55);
    public static final com.zettle.android.entities.CurrencyId GIP = new com.zettle.android.entities.CurrencyId("GIP", 56);
    public static final com.zettle.android.entities.CurrencyId GMD = new com.zettle.android.entities.CurrencyId("GMD", 57);
    public static final com.zettle.android.entities.CurrencyId GNF = new com.zettle.android.entities.CurrencyId("GNF", 58);
    public static final com.zettle.android.entities.CurrencyId GTQ = new com.zettle.android.entities.CurrencyId("GTQ", 59);
    public static final com.zettle.android.entities.CurrencyId GYD = new com.zettle.android.entities.CurrencyId("GYD", 60);
    public static final com.zettle.android.entities.CurrencyId HKD = new com.zettle.android.entities.CurrencyId("HKD", 61);
    public static final com.zettle.android.entities.CurrencyId HNL = new com.zettle.android.entities.CurrencyId("HNL", 62);
    public static final com.zettle.android.entities.CurrencyId HRK = new com.zettle.android.entities.CurrencyId("HRK", 63);
    public static final com.zettle.android.entities.CurrencyId HTG = new com.zettle.android.entities.CurrencyId("HTG", 64);
    public static final com.zettle.android.entities.CurrencyId HUF = new com.zettle.android.entities.CurrencyId("HUF", 65);
    public static final com.zettle.android.entities.CurrencyId IDR = new com.zettle.android.entities.CurrencyId("IDR", 66);
    public static final com.zettle.android.entities.CurrencyId ILS = new com.zettle.android.entities.CurrencyId("ILS", 67);
    public static final com.zettle.android.entities.CurrencyId IMP = new com.zettle.android.entities.CurrencyId("IMP", 68);
    public static final com.zettle.android.entities.CurrencyId INR = new com.zettle.android.entities.CurrencyId("INR", 69);
    public static final com.zettle.android.entities.CurrencyId IQD = new com.zettle.android.entities.CurrencyId("IQD", 70);
    public static final com.zettle.android.entities.CurrencyId IRR = new com.zettle.android.entities.CurrencyId("IRR", 71);
    public static final com.zettle.android.entities.CurrencyId ISK = new com.zettle.android.entities.CurrencyId("ISK", 72);
    public static final com.zettle.android.entities.CurrencyId JEP = new com.zettle.android.entities.CurrencyId("JEP", 73);
    public static final com.zettle.android.entities.CurrencyId JMD = new com.zettle.android.entities.CurrencyId("JMD", 74);
    public static final com.zettle.android.entities.CurrencyId JOD = new com.zettle.android.entities.CurrencyId("JOD", 75);
    public static final com.zettle.android.entities.CurrencyId JPY = new com.zettle.android.entities.CurrencyId("JPY", 76);
    public static final com.zettle.android.entities.CurrencyId KES = new com.zettle.android.entities.CurrencyId("KES", 77);
    public static final com.zettle.android.entities.CurrencyId KGS = new com.zettle.android.entities.CurrencyId("KGS", 78);
    public static final com.zettle.android.entities.CurrencyId KHR = new com.zettle.android.entities.CurrencyId("KHR", 79);
    public static final com.zettle.android.entities.CurrencyId KMF = new com.zettle.android.entities.CurrencyId("KMF", 80);
    public static final com.zettle.android.entities.CurrencyId KPW = new com.zettle.android.entities.CurrencyId("KPW", 81);
    public static final com.zettle.android.entities.CurrencyId KRW = new com.zettle.android.entities.CurrencyId("KRW", 82);
    public static final com.zettle.android.entities.CurrencyId KWD = new com.zettle.android.entities.CurrencyId("KWD", 83);
    public static final com.zettle.android.entities.CurrencyId KYD = new com.zettle.android.entities.CurrencyId("KYD", 84);
    public static final com.zettle.android.entities.CurrencyId KZT = new com.zettle.android.entities.CurrencyId("KZT", 85);
    public static final com.zettle.android.entities.CurrencyId LAK = new com.zettle.android.entities.CurrencyId("LAK", 86);
    public static final com.zettle.android.entities.CurrencyId LBP = new com.zettle.android.entities.CurrencyId("LBP", 87);
    public static final com.zettle.android.entities.CurrencyId LKR = new com.zettle.android.entities.CurrencyId("LKR", 88);
    public static final com.zettle.android.entities.CurrencyId LRD = new com.zettle.android.entities.CurrencyId("LRD", 89);
    public static final com.zettle.android.entities.CurrencyId LSL = new com.zettle.android.entities.CurrencyId("LSL", 90);
    public static final com.zettle.android.entities.CurrencyId LTL = new com.zettle.android.entities.CurrencyId("LTL", 91);
    public static final com.zettle.android.entities.CurrencyId LVL = new com.zettle.android.entities.CurrencyId("LVL", 92);
    public static final com.zettle.android.entities.CurrencyId LYD = new com.zettle.android.entities.CurrencyId("LYD", 93);
    public static final com.zettle.android.entities.CurrencyId MAD = new com.zettle.android.entities.CurrencyId("MAD", 94);
    public static final com.zettle.android.entities.CurrencyId MDL = new com.zettle.android.entities.CurrencyId("MDL", 95);
    public static final com.zettle.android.entities.CurrencyId MGA = new com.zettle.android.entities.CurrencyId("MGA", 96);
    public static final com.zettle.android.entities.CurrencyId MKD = new com.zettle.android.entities.CurrencyId("MKD", 97);
    public static final com.zettle.android.entities.CurrencyId MMK = new com.zettle.android.entities.CurrencyId("MMK", 98);
    public static final com.zettle.android.entities.CurrencyId MNT = new com.zettle.android.entities.CurrencyId("MNT", 99);
    public static final com.zettle.android.entities.CurrencyId MOP = new com.zettle.android.entities.CurrencyId("MOP", 100);
    public static final com.zettle.android.entities.CurrencyId MRO = new com.zettle.android.entities.CurrencyId("MRO", 101);
    public static final com.zettle.android.entities.CurrencyId MTL = new com.zettle.android.entities.CurrencyId("MTL", 102);
    public static final com.zettle.android.entities.CurrencyId MUR = new com.zettle.android.entities.CurrencyId("MUR", 103);
    public static final com.zettle.android.entities.CurrencyId MVR = new com.zettle.android.entities.CurrencyId("MVR", 104);
    public static final com.zettle.android.entities.CurrencyId MWK = new com.zettle.android.entities.CurrencyId("MWK", 105);
    public static final com.zettle.android.entities.CurrencyId MXN = new com.zettle.android.entities.CurrencyId("MXN", 106);
    public static final com.zettle.android.entities.CurrencyId MYR = new com.zettle.android.entities.CurrencyId("MYR", 107);
    public static final com.zettle.android.entities.CurrencyId MZM = new com.zettle.android.entities.CurrencyId("MZM", 108);
    public static final com.zettle.android.entities.CurrencyId MZN = new com.zettle.android.entities.CurrencyId("MZN", 109);
    public static final com.zettle.android.entities.CurrencyId NAD = new com.zettle.android.entities.CurrencyId("NAD", 110);
    public static final com.zettle.android.entities.CurrencyId NGN = new com.zettle.android.entities.CurrencyId("NGN", 111);
    public static final com.zettle.android.entities.CurrencyId NIO = new com.zettle.android.entities.CurrencyId("NIO", 112);
    public static final com.zettle.android.entities.CurrencyId NOK = new com.zettle.android.entities.CurrencyId("NOK", 113);
    public static final com.zettle.android.entities.CurrencyId NPR = new com.zettle.android.entities.CurrencyId("NPR", 114);
    public static final com.zettle.android.entities.CurrencyId NZD = new com.zettle.android.entities.CurrencyId("NZD", 115);
    public static final com.zettle.android.entities.CurrencyId OMR = new com.zettle.android.entities.CurrencyId("OMR", 116);
    public static final com.zettle.android.entities.CurrencyId PAB = new com.zettle.android.entities.CurrencyId("PAB", 117);
    public static final com.zettle.android.entities.CurrencyId PEN = new com.zettle.android.entities.CurrencyId("PEN", 118);
    public static final com.zettle.android.entities.CurrencyId PGK = new com.zettle.android.entities.CurrencyId("PGK", 119);
    public static final com.zettle.android.entities.CurrencyId PHP = new com.zettle.android.entities.CurrencyId("PHP", 120);
    public static final com.zettle.android.entities.CurrencyId PKR = new com.zettle.android.entities.CurrencyId("PKR", 121);
    public static final com.zettle.android.entities.CurrencyId PLN = new com.zettle.android.entities.CurrencyId("PLN", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
    public static final com.zettle.android.entities.CurrencyId PYG = new com.zettle.android.entities.CurrencyId("PYG", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
    public static final com.zettle.android.entities.CurrencyId QAR = new com.zettle.android.entities.CurrencyId("QAR", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
    public static final com.zettle.android.entities.CurrencyId RON = new com.zettle.android.entities.CurrencyId("RON", 125);
    public static final com.zettle.android.entities.CurrencyId RSD = new com.zettle.android.entities.CurrencyId("RSD", 126);
    public static final com.zettle.android.entities.CurrencyId RUB = new com.zettle.android.entities.CurrencyId("RUB", 127);
    public static final com.zettle.android.entities.CurrencyId RWF = new com.zettle.android.entities.CurrencyId("RWF", 128);
    public static final com.zettle.android.entities.CurrencyId SAR = new com.zettle.android.entities.CurrencyId("SAR", 129);
    public static final com.zettle.android.entities.CurrencyId SBD = new com.zettle.android.entities.CurrencyId("SBD", 130);
    public static final com.zettle.android.entities.CurrencyId SCR = new com.zettle.android.entities.CurrencyId("SCR", 131);
    public static final com.zettle.android.entities.CurrencyId SDD = new com.zettle.android.entities.CurrencyId("SDD", 132);
    public static final com.zettle.android.entities.CurrencyId SDG = new com.zettle.android.entities.CurrencyId("SDG", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
    public static final com.zettle.android.entities.CurrencyId SEK = new com.zettle.android.entities.CurrencyId("SEK", 134);
    public static final com.zettle.android.entities.CurrencyId SGD = new com.zettle.android.entities.CurrencyId("SGD", 135);
    public static final com.zettle.android.entities.CurrencyId SHP = new com.zettle.android.entities.CurrencyId("SHP", 136);
    public static final com.zettle.android.entities.CurrencyId SIT = new com.zettle.android.entities.CurrencyId("SIT", 137);
    public static final com.zettle.android.entities.CurrencyId SKK = new com.zettle.android.entities.CurrencyId("SKK", 138);
    public static final com.zettle.android.entities.CurrencyId SLL = new com.zettle.android.entities.CurrencyId("SLL", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
    public static final com.zettle.android.entities.CurrencyId SOS = new com.zettle.android.entities.CurrencyId("SOS", 140);
    public static final com.zettle.android.entities.CurrencyId SPL = new com.zettle.android.entities.CurrencyId("SPL", 141);
    public static final com.zettle.android.entities.CurrencyId SRD = new com.zettle.android.entities.CurrencyId("SRD", 142);
    public static final com.zettle.android.entities.CurrencyId SSP = new com.zettle.android.entities.CurrencyId("SSP", 143);
    public static final com.zettle.android.entities.CurrencyId STD = new com.zettle.android.entities.CurrencyId("STD", 144);
    public static final com.zettle.android.entities.CurrencyId SVC = new com.zettle.android.entities.CurrencyId("SVC", 145);
    public static final com.zettle.android.entities.CurrencyId SYP = new com.zettle.android.entities.CurrencyId("SYP", 146);
    public static final com.zettle.android.entities.CurrencyId SZL = new com.zettle.android.entities.CurrencyId("SZL", 147);
    public static final com.zettle.android.entities.CurrencyId THB = new com.zettle.android.entities.CurrencyId("THB", 148);
    public static final com.zettle.android.entities.CurrencyId TJS = new com.zettle.android.entities.CurrencyId("TJS", 149);
    public static final com.zettle.android.entities.CurrencyId TMM = new com.zettle.android.entities.CurrencyId("TMM", 150);
    public static final com.zettle.android.entities.CurrencyId TMT = new com.zettle.android.entities.CurrencyId("TMT", 151);
    public static final com.zettle.android.entities.CurrencyId TND = new com.zettle.android.entities.CurrencyId("TND", 152);
    public static final com.zettle.android.entities.CurrencyId TOP = new com.zettle.android.entities.CurrencyId("TOP", 153);
    public static final com.zettle.android.entities.CurrencyId TRL = new com.zettle.android.entities.CurrencyId("TRL", 154);
    public static final com.zettle.android.entities.CurrencyId TRY = new com.zettle.android.entities.CurrencyId("TRY", 155);
    public static final com.zettle.android.entities.CurrencyId TTD = new com.zettle.android.entities.CurrencyId("TTD", 156);
    public static final com.zettle.android.entities.CurrencyId TVD = new com.zettle.android.entities.CurrencyId("TVD", 157);
    public static final com.zettle.android.entities.CurrencyId TWD = new com.zettle.android.entities.CurrencyId("TWD", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
    public static final com.zettle.android.entities.CurrencyId TZS = new com.zettle.android.entities.CurrencyId("TZS", 159);
    public static final com.zettle.android.entities.CurrencyId UAH = new com.zettle.android.entities.CurrencyId("UAH", 160);
    public static final com.zettle.android.entities.CurrencyId UGX = new com.zettle.android.entities.CurrencyId("UGX", 161);
    public static final com.zettle.android.entities.CurrencyId USD = new com.zettle.android.entities.CurrencyId("USD", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
    public static final com.zettle.android.entities.CurrencyId UYU = new com.zettle.android.entities.CurrencyId("UYU", 163);
    public static final com.zettle.android.entities.CurrencyId UZS = new com.zettle.android.entities.CurrencyId("UZS", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
    public static final com.zettle.android.entities.CurrencyId VEB = new com.zettle.android.entities.CurrencyId("VEB", 165);
    public static final com.zettle.android.entities.CurrencyId VEF = new com.zettle.android.entities.CurrencyId("VEF", 166);
    public static final com.zettle.android.entities.CurrencyId VND = new com.zettle.android.entities.CurrencyId("VND", 167);
    public static final com.zettle.android.entities.CurrencyId VUV = new com.zettle.android.entities.CurrencyId("VUV", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
    public static final com.zettle.android.entities.CurrencyId WST = new com.zettle.android.entities.CurrencyId("WST", com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
    public static final com.zettle.android.entities.CurrencyId XAF = new com.zettle.android.entities.CurrencyId("XAF", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
    public static final com.zettle.android.entities.CurrencyId XAG = new com.zettle.android.entities.CurrencyId("XAG", 171);
    public static final com.zettle.android.entities.CurrencyId XAU = new com.zettle.android.entities.CurrencyId("XAU", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
    public static final com.zettle.android.entities.CurrencyId XCD = new com.zettle.android.entities.CurrencyId("XCD", com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
    public static final com.zettle.android.entities.CurrencyId XDR = new com.zettle.android.entities.CurrencyId("XDR", 174);
    public static final com.zettle.android.entities.CurrencyId XOF = new com.zettle.android.entities.CurrencyId("XOF", 175);
    public static final com.zettle.android.entities.CurrencyId XPD = new com.zettle.android.entities.CurrencyId("XPD", 176);
    public static final com.zettle.android.entities.CurrencyId XPF = new com.zettle.android.entities.CurrencyId("XPF", com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
    public static final com.zettle.android.entities.CurrencyId XPT = new com.zettle.android.entities.CurrencyId("XPT", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE);
    public static final com.zettle.android.entities.CurrencyId YER = new com.zettle.android.entities.CurrencyId("YER", 179);
    public static final com.zettle.android.entities.CurrencyId ZAR = new com.zettle.android.entities.CurrencyId("ZAR", com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
    public static final com.zettle.android.entities.CurrencyId ZMK = new com.zettle.android.entities.CurrencyId("ZMK", 181);
    public static final com.zettle.android.entities.CurrencyId ZMW = new com.zettle.android.entities.CurrencyId("ZMW", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE);
    public static final com.zettle.android.entities.CurrencyId ZWD = new com.zettle.android.entities.CurrencyId("ZWD", 183);
    public static final com.zettle.android.entities.CurrencyId ZWL = new com.zettle.android.entities.CurrencyId("ZWL", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);

    private CurrencyId(java.lang.String str, int i) {
    }

    static {
        com.zettle.android.entities.CurrencyId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.zettle.android.entities.CurrencyId[] values() {
        return (com.zettle.android.entities.CurrencyId[]) $VALUES.clone();
    }

    public static com.zettle.android.entities.CurrencyId valueOf(java.lang.String str) {
        return (com.zettle.android.entities.CurrencyId) java.lang.Enum.valueOf(com.zettle.android.entities.CurrencyId.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.android.entities.CurrencyId> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.zettle.android.entities.CurrencyId[] $values() {
        return new com.zettle.android.entities.CurrencyId[]{AED, AFA, AFN, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZM, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB, BRL, BSD, BTN, BWP, BYR, BZD, CAD, CDF, CHF, CLP, CNY, COP, CRC, CSD, CUC, CUP, CVE, CYP, CZK, DJF, DKK, DOP, DZD, EEK, EGP, ERN, ETB, EUR, FJD, FKP, GBP, GEL, GGP, GHC, GHS, GIP, GMD, GNF, GTQ, GYD, HKD, HNL, HRK, HTG, HUF, IDR, ILS, IMP, INR, IQD, IRR, ISK, JEP, JMD, JOD, JPY, KES, KGS, KHR, KMF, KPW, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LVL, LYD, MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRO, MTL, MUR, MVR, MWK, MXN, MYR, MZM, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDD, SDG, SEK, SGD, SHP, SIT, SKK, SLL, SOS, SPL, SRD, SSP, STD, SVC, SYP, SZL, THB, TJS, TMM, TMT, TND, TOP, TRL, TRY, TTD, TVD, TWD, TZS, UAH, UGX, USD, UYU, UZS, VEB, VEF, VND, VUV, WST, XAF, XAG, XAU, XCD, XDR, XOF, XPD, XPF, XPT, YER, ZAR, ZMK, ZMW, ZWD, ZWL};
    }
}
