package M8;

import B4.V;
import android.content.Context;
import androidx.recyclerview.widget.m;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes9.dex */
public final class b implements Rm0.e {
    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static HashMap a() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList e11 = V.e(36, hashMap, V.e(34, hashMap, V.e(33, hashMap, V.e(32, hashMap, V.e(31, hashMap, V.e(30, hashMap, V.e(27, hashMap, V.e(20, hashMap, V.e(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        e11.add("VA");
        hashMap.put(39, e11);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList e12 = V.e(43, hashMap, V.e(41, hashMap, V.e(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        e12.add("GG");
        e12.add("IM");
        e12.add("JE");
        hashMap.put(44, e12);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList e13 = V.e(46, hashMap, V.e(45, hashMap, arrayList4, 1, "SE"), 2, "NO");
        e13.add("SJ");
        hashMap.put(47, e13);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList e14 = V.e(60, hashMap, V.e(58, hashMap, V.e(57, hashMap, V.e(56, hashMap, V.e(55, hashMap, V.e(54, hashMap, V.e(53, hashMap, V.e(52, hashMap, V.e(51, hashMap, V.e(49, hashMap, V.e(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        e14.add("CC");
        e14.add("CX");
        hashMap.put(61, e14);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList e15 = V.e(211, hashMap, V.e(98, hashMap, V.e(95, hashMap, V.e(94, hashMap, V.e(93, hashMap, V.e(92, hashMap, V.e(91, hashMap, V.e(90, hashMap, V.e(86, hashMap, V.e(84, hashMap, V.e(82, hashMap, V.e(81, hashMap, V.e(66, hashMap, V.e(65, hashMap, V.e(64, hashMap, V.e(63, hashMap, V.e(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        e15.add("EH");
        hashMap.put(212, e15);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList e16 = V.e(261, hashMap, V.e(260, hashMap, V.e(258, hashMap, V.e(257, hashMap, V.e(256, hashMap, V.e(255, hashMap, V.e(254, hashMap, V.e(253, hashMap, V.e(252, hashMap, V.e(251, hashMap, V.e(m.e.DEFAULT_SWIPE_ANIMATION_DURATION, hashMap, V.e(249, hashMap, V.e(248, hashMap, V.e(247, hashMap, V.e(246, hashMap, V.e(245, hashMap, V.e(244, hashMap, V.e(243, hashMap, V.e(242, hashMap, V.e(241, hashMap, V.e(240, hashMap, V.e(239, hashMap, V.e(238, hashMap, V.e(237, hashMap, V.e(236, hashMap, V.e(235, hashMap, V.e(234, hashMap, V.e(233, hashMap, V.e(232, hashMap, V.e(231, hashMap, V.e(230, hashMap, V.e(229, hashMap, V.e(228, hashMap, V.e(227, hashMap, V.e(226, hashMap, V.e(225, hashMap, V.e(224, hashMap, V.e(223, hashMap, V.e(222, hashMap, V.e(221, hashMap, V.e(220, hashMap, V.e(218, hashMap, V.e(216, hashMap, V.e(213, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        e16.add("YT");
        hashMap.put(262, e16);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList e17 = V.e(269, hashMap, V.e(268, hashMap, V.e(267, hashMap, V.e(266, hashMap, V.e(265, hashMap, V.e(264, hashMap, V.e(263, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        e17.add("TA");
        hashMap.put(290, e17);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList e18 = V.e(357, hashMap, V.e(356, hashMap, V.e(355, hashMap, V.e(354, hashMap, V.e(353, hashMap, V.e(352, hashMap, V.e(351, hashMap, V.e(350, hashMap, V.e(299, hashMap, V.e(298, hashMap, V.e(297, hashMap, V.e(291, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        e18.add("AX");
        hashMap.put(358, e18);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList e19 = V.e(509, hashMap, V.e(508, hashMap, V.e(507, hashMap, V.e(506, hashMap, V.e(505, hashMap, V.e(504, hashMap, V.e(503, hashMap, V.e(502, hashMap, V.e(501, hashMap, V.e(CounterView.COUNTER_MAX_DEFAULT, hashMap, V.e(423, hashMap, V.e(421, hashMap, V.e(420, hashMap, V.e(389, hashMap, V.e(387, hashMap, V.e(386, hashMap, V.e(385, hashMap, V.e(383, hashMap, V.e(382, hashMap, V.e(381, hashMap, V.e(380, hashMap, V.e(378, hashMap, V.e(377, hashMap, V.e(376, hashMap, V.e(375, hashMap, V.e(374, hashMap, V.e(373, hashMap, V.e(372, hashMap, V.e(371, hashMap, V.e(370, hashMap, V.e(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        e19.add("BL");
        e19.add("MF");
        hashMap.put(590, e19);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList e21 = V.e(598, hashMap, V.e(597, hashMap, V.e(596, hashMap, V.e(595, hashMap, V.e(594, hashMap, V.e(593, hashMap, V.e(592, hashMap, V.e(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        e21.add("BQ");
        hashMap.put(599, e21);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(Integer.valueOf(DescriptorProtos$Edition.EDITION_PROTO2_VALUE), V.e(996, hashMap, V.e(995, hashMap, V.e(994, hashMap, V.e(993, hashMap, V.e(992, hashMap, V.e(979, hashMap, V.e(977, hashMap, V.e(976, hashMap, V.e(975, hashMap, V.e(974, hashMap, V.e(973, hashMap, V.e(972, hashMap, V.e(971, hashMap, V.e(970, hashMap, V.e(968, hashMap, V.e(967, hashMap, V.e(966, hashMap, V.e(965, hashMap, V.e(964, hashMap, V.e(963, hashMap, V.e(962, hashMap, V.e(961, hashMap, V.e(960, hashMap, V.e(888, hashMap, V.e(886, hashMap, V.e(883, hashMap, V.e(882, hashMap, V.e(881, hashMap, V.e(880, hashMap, V.e(878, hashMap, V.e(870, hashMap, V.e(856, hashMap, V.e(855, hashMap, V.e(853, hashMap, V.e(852, hashMap, V.e(850, hashMap, V.e(808, hashMap, V.e(800, hashMap, V.e(692, hashMap, V.e(691, hashMap, V.e(690, hashMap, V.e(689, hashMap, V.e(688, hashMap, V.e(687, hashMap, V.e(686, hashMap, V.e(685, hashMap, V.e(683, hashMap, V.e(682, hashMap, V.e(681, hashMap, V.e(680, hashMap, V.e(679, hashMap, V.e(678, hashMap, V.e(677, hashMap, V.e(676, hashMap, V.e(675, hashMap, V.e(674, hashMap, V.e(673, hashMap, V.e(672, hashMap, V.e(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }
}
