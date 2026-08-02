package P60;

import androidx.recyclerview.widget.m;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AIKB_YENISEYSKY_OBEDINENNY_BANK;
    public static final c AKB_DERZHAVA;
    public static final c AKB_EUROFINANS_MOSNARBANK;
    public static final c AKB_LANTA_BANK;
    public static final c AKB_NRBANK;
    public static final c AKB_SLAVIYA;
    public static final c AKB_TENDER_BANK;
    public static final c ALEF_BANK;
    public static final c ALMAZERGIENBANK;
    public static final c ALTAYKAPITALBANK;
    public static final c ALTERNATIVA;
    public static final c AVITO_KOSHELEK;
    public static final c AVOTORGBANK;
    public static final c AVTO_FINANS_BANK;
    public static final c BANK_AGROROS;
    public static final c BANK_ALEKSANDROVSKY;
    public static final c BANK_AVANGARD;
    public static final c BANK_AVERS;
    public static final c BANK_BZF;
    public static final c BANK_CENTROKREDIT;
    public static final c BANK_CHBRR;
    public static final c BANK_FINSERVIS;
    public static final c BANK_INTEZA;
    public static final c BANK_IPB;
    public static final c BANK_ITURUP;
    public static final c BANK_KREMLYOVSKY;
    public static final c BANK_KUZNETSKY;
    public static final c BANK_MBA_MOSKVA;
    public static final c BANK_MOSKVA_SITI;
    public static final c BANK_NOVIKOM;
    public static final c BANK_OBEDINENNY_KAPITAL;
    public static final c BANK_ORANZHEVY;
    public static final c BANK_PERM;
    public static final c BANK_PRIMORYE;
    public static final c BANK_PTB;
    public static final c BANK_RAUND;
    public static final c BANK_RAZVITIE_STOLITSA;
    public static final c BANK_RESO_KREDIT;
    public static final c BANK_RSI;
    public static final c BANK_SARATOV;
    public static final c BANK_SGB;
    public static final c BANK_SINARA;
    public static final c BANK_SNEZHINSKY;
    public static final c BANK_SNGB;
    public static final c BANK_VENETS;
    public static final c BANK_VOLGOZHANIN;
    public static final c BANK_ZARECHIE;
    public static final c BLANK_BANK;
    public static final c CMRBANK;
    public static final c DRAYV_KLIK_BANK;
    public static final c ENERGOBANK;
    public static final c FINSTAR_BANK;
    public static final c FORA_BANK;
    public static final c GAZPROMBANK;
    public static final c GAZTRANSBANK;
    public static final c INBANK;
    public static final c INEKO;
    public static final c ISHBANK;
    public static final c KBER_BANK_KAZANI;
    public static final c KB_DOLINSK;
    public static final c KB_ENERGOTRANSBANK;
    public static final c KB_KROKUS_BANK;
    public static final c KB_LOKO_BANK;
    public static final c KB_STROYLESBANK;
    public static final c KHAYS;
    public static final c KOSHELEK_TSUPIS;
    public static final c KUBAN_TORGBANK;
    public static final c KUZNETSKBIZNESBANK;
    public static final c MEZHDUNARODNY_FINANSOVY_KLUB;
    public static final c MEZhREGIONALNOE_OPERATSIONNOE_UFK;
    public static final c MORSKOY_BANK;
    public static final c MOSCOMBANK;
    public static final c MS_BANK_RUS;
    public static final c MTS_DENGI;
    public static final c NATSINVESTPROMBANK;
    public static final c NDBANK;
    public static final c NKO_ELEKSIR;
    public static final c NKO_MKS;
    public static final c NKO_PERSPEKTIVA;
    public static final c NK_BANK;
    public static final c NORVIK_BANK;
    public static final c NOVOBANK;
    public static final c OZON_BANK;
    public static final c PERVOURALSKBANK;
    public static final c PERVY_INVESTITSIONNY_BANK;
    public static final c PLATEZHNY_KONSTRUKTOR;
    public static final c PLAYT;
    public static final c POCHTA_BANK;
    public static final c PRIO_VNESHTORGBANK;
    public static final c PROMSElKHOZBANK;
    public static final c REALIST_BANK;
    public static final c RUSNARBANK;
    public static final c RUSUNIVERSALBANK;
    public static final c SEVERNY_NARODNY_BANK;
    public static final c SOCIUM_BANK;
    public static final c SOLID_BANK;
    public static final c STAVROPOLPROMSTROYBANK;
    public static final c SVOY_BANK;
    public static final c TATSOBANK;
    public static final c TAVRICHESKY_BANK;
    public static final c TOCHKA_BANK;
    public static final c TOLYATTIkhimbank;
    public static final c TOMSKPROMSTROYBANK;
    public static final c TRANSSTROYBANK;
    public static final c TSIFRA_BANK;
    public static final c UG_INVESTBANK;
    public static final c UKB_BELGORODSOCBANK;
    public static final c UNISTREAM_BANK;
    public static final c URAL_FD;
    public static final c VNESHFINBANK;
    public static final c VUZ_BANK;
    public static final c WILDBERRIES;
    public static final c YARINTERBANK;
    public static final c ZEMSKY_BANK;
    public static final c ZhIVAGO_BANK;
    private final long memberId;
    private final String packageNameB2B;
    private final String packageNameB2C;

    @NotNull
    private final u[] patterns;
    public static final c T_BANK = new c("T_BANK", 3, 100000000004L, new u[0], "com.idamob.tinkoff.android", "ru.tinkoff.sme");
    public static final c VTB = new c("VTB", 4, 100000000005L, new u[]{new u("me2mepull.nspk.ru", "/confirmation")}, "ru.vtb24.mobilebanking.android", "ru.vtb.smb");
    public static final c ALFA_BANK = new c("ALFA_BANK", 7, 100000000008L, new u[]{new u("qr.nspk.ru"), new u("sub.nspk.ru"), new u("sbpay"), new u("me2mepull.nspk.ru", "/confirmation")}, "ru.alfabank.mobile.android", "ru.alfabank.oavdo.amc");
    public static final c SBERBANK = new c("SBERBANK", 84, 100000000111L, new u[]{new u("qr.nspk.ru"), new u("sub.nspk.ru"), new u("sbpay"), new u("b2b.cbrpay.ru")}, "ru.sberbankmobile", "ru.sberbank_sbbol");
    public static final c ZOLOTAYA_KORONA = new c("ZOLOTAYA_KORONA", 1, 100000000002L, new u[0], (String) null, 12);
    public static final c AK_BARS_BANK = new c("AK_BARS_BANK", 5, 100000000006L, new u[0], "ru.akbars.mobile", 8);
    public static final c RAIFFEISEN_BANK = new c("RAIFFEISEN_BANK", 6, 100000000007L, new u[0], "ru.raiffeisennews", 8);
    public static final c PROMSVYAZBANK = new c("PROMSVYAZBANK", 8, 100000000010L, new u[0], "logo.com.mbanking", 8);
    public static final c RNKB_BANK = new c("RNKB_BANK", 9, 100000000011L, new u[0], "com.bifit.rncbbeta", 8);
    public static final c ROSBANK = new c("ROSBANK", 10, 100000000012L, new u[0], (String) null, 12);
    public static final c SOVCOMBANK = new c("SOVCOMBANK", 11, 100000000013L, new u[0], "ru.sovcomcard.halva.v1", 8);
    public static final c BANK_RUSSKY_STANDART = new c("BANK_RUSSKY_STANDART", 12, 100000000014L, new u[0], "ru.simpls.brs2.mobbank", 8);
    public static final c BANK_FK_OTKRYTIE = new c("BANK_FK_OTKRYTIE", 13, 100000000015L, new u[0], "com.openbank", 8);
    public static final c MTS_BANK = new c("MTS_BANK", 15, 100000000017L, new u[0], "ru.mts.money", 8);
    public static final c OTP_BANK = new c("OTP_BANK", 16, 100000000018L, new u[0], "ru.otpbank.mobile", 8);
    public static final c ROSSELKHOZBANK = new c("ROSSELKHOZBANK", 17, 100000000020L, new u[0], "ru.rshb.dbo", 8);
    public static final c YUMANI = new c("YUMANI", 18, 100000000022L, new u[0], "ru.yoo.money", 8);
    public static final c HOME_CREDIT_BANK = new c("HOME_CREDIT_BANK", 19, 100000000024L, new u[0], "ru.homecredit.mycredit", 8);
    public static final c MKB = new c("MKB", 20, 100000000025L, new u[0], "ru.mkb.mobile", 8);
    public static final c BANK_URALSIB = new c("BANK_URALSIB", 21, 100000000026L, new u[0], "ru.bankuralsib.mb.android", 8);
    public static final c KREDIT_EUROPA_BANK = new c("KREDIT_EUROPA_BANK", 22, 100000000027L, new u[0], "com.idamobile.android.crediteuropa", 8);
    public static final c BANK_SANKT_PETERBURG = new c("BANK_SANKT_PETERBURG", 24, 100000000029L, new u[0], "ru.bspb", 8);
    public static final c UNICREDIT_BANK = new c("UNICREDIT_BANK", 25, 100000000030L, new u[0], "ru.unicredit.android", 8);
    public static final c UBRIR = new c("UBRIR", 26, 100000000031L, new u[0], "cb.ibank", 8);
    public static final c RENAISSANCE_BANK = new c("RENAISSANCE_BANK", 27, 100000000032L, new u[0], "cz.bsc.rc", 8);
    public static final c TRANSCAPITALBANK = new c("TRANSCAPITALBANK", 28, 100000000034L, new u[0], "ru.ftc.faktura.tkbbank", 8);
    public static final c GENBANK = new c("GENBANK", 29, 100000000037L, new u[0], "com.mmonline.mobile", 8);
    public static final c BANK_FINAM = new c("BANK_FINAM", 30, 100000000040L, new u[0], "ru.finambank.app", 8);
    public static final c BKS_BANK = new c("BKS_BANK", 31, 100000000041L, new u[0], "ru.bcs.bcsbank", 8);
    public static final c GAZENERGOBANK = new c("GAZENERGOBANK", 33, 100000000043L, new u[0], "ru.gebank.ib", 8);
    public static final c EKSPOBANK = new c("EKSPOBANK", 34, 100000000044L, new u[0], "ru.ftc.faktura.expobank", 8);
    public static final c BANK_ZENIT = new c("BANK_ZENIT", 35, 100000000045L, new u[0], "ru.zenit.android", 8);
    public static final c METALLINVESTBANK = new c("METALLINVESTBANK", 36, 100000000046L, new u[0], "com.isimplelab.ionic.metal.fl", 8);
    public static final c ABSOLYUT_BANK = new c("ABSOLYUT_BANK", 37, 100000000047L, new u[0], "ru.ftc.faktura.absolutbank", 8);
    public static final c BANK_VBRR = new c("BANK_VBRR", 38, 100000000049L, new u[0], "com.bssys.vbrrretail", 8);
    public static final c KUBAN_CREDIT = new c("KUBAN_CREDIT", 39, 100000000050L, new u[0], "com.isimplelab.ibank.kubankredit", 8);
    public static final c BANK_LEVOBEREZHY = new c("BANK_LEVOBEREZHY", 40, 100000000052L, new u[0], "ru.ftc.faktura.nskbl", 8);
    public static final c BANK_YOSHKAR_OLA = new c("BANK_YOSHKAR_OLA", 42, 100000000055L, new u[0], (String) null, 12);
    public static final c KB_KHLYNOV = new c("KB_KHLYNOV", 43, 100000000056L, new u[0], "ru.bank_hlynov.xbank", 8);
    public static final c VK_PAY = new c("VK_PAY", 44, 100000000057L, new u[0], (String) null, 12);
    public static final c VLADBIZNESBANK = new c("VLADBIZNESBANK", 45, 100000000058L, new u[0], "ru.ftc.faktura.vlbb", 8);
    public static final c CENTR_INVEST = new c("CENTR_INVEST", 46, 100000000059L, new u[0], "ru.centrinvest.mobilebanking2018", 8);
    public static final c MONETA = new c("MONETA", 47, 100000000061L, new u[0], (String) null, 12);
    public static final c NOKSSBANK = new c("NOKSSBANK", 48, 100000000062L, new u[0], "ru.ftc.faktura.nokss", 8);
    public static final c KREDIT_URAL_BANK = new c("KREDIT_URAL_BANK", 49, 100000000064L, new u[0], "com.credituralbank.CUBmobilenew", 8);
    public static final c NOVY_VEK = new c("NOVY_VEK", 51, 100000000067L, new u[0], "com.isimplelab.ionic.standart", 8);
    public static final c PLATEZHI_I_RASCHETY = new c("PLATEZHI_I_RASCHETY", 52, 100000000068L, new u[0], (String) null, 12);
    public static final c SDM_BANK = new c("SDM_BANK", 53, 100000000069L, new u[0], "ru.ftc.faktura.sdm", 8);
    public static final c DATABANK = new c("DATABANK", 54, 100000000070L, new u[0], "com.mifors.izhcombank", 8);
    public static final c NS_BANK = new c("NS_BANK", 55, 100000000071L, new u[0], "ru.ftc.faktura.ns", 8);
    public static final c BRATSKY_ANKB = new c("BRATSKY_ANKB", 56, 100000000072L, new u[0], (String) null, 12);
    public static final c RNKO_EDINAYA_KASSA = new c("RNKO_EDINAYA_KASSA", 57, 100000000076L, new u[0], (String) null, 12);
    public static final c INGOSSTRAKH_BANK = new c("INGOSSTRAKH_BANK", 58, 100000000078L, new u[0], "com.banksoyuz.artsofte", 8);
    public static final c FORSHTADT = new c("FORSHTADT", 60, 100000000081L, new u[0], "ru.ftc.faktura.forshtadt", 8);
    public static final c BANK_DOM_RF = new c("BANK_DOM_RF", 61, 100000000082L, new u[0], "ru.bssys.roscapretail", 8);
    public static final c DALNEVOSTOCHNY_BANK = new c("DALNEVOSTOCHNY_BANK", 62, 100000000083L, new u[0], "com.bifit.dvbank", 8);
    public static final c ROSDORBANK = new c("ROSDORBANK", 63, 100000000084L, new u[0], "ru.rosdorbank.physical", 8);
    public static final c ELPLAT = new c("ELPLAT", 64, 100000000086L, new u[0], "ru.elplat.elplat2", 8);
    public static final c BANK_PSCB = new c("BANK_PSCB", 65, 100000000087L, new u[0], "ru.ftc.faktura.pskb", 8);
    public static final c SKB_PRIMSOCBANK = new c("SKB_PRIMSOCBANK", 66, 100000000088L, new u[0], "ru.ftc.faktura.primsoc", 8);
    public static final c KONTUR_BANK = new c("KONTUR_BANK", 67, 100000000090L, new u[0], "ru.emb.android", 8);
    public static final c BYSTROBANK = new c("BYSTROBANK", 69, 100000000092L, new u[0], "ru.ilb.bbmobile", 8);
    public static final c UGLEMETBANK = new c("UGLEMETBANK", 70, 100000000093L, new u[0], "com.isimplelab.isimpleceo.uglemet", 8);
    public static final c CHELYABINVESTBANK = new c("CHELYABINVESTBANK", 71, 100000000094L, new u[0], "ru.chelyabinvestbank.investpay", 8);
    public static final c AB_ROSSIYA = new c("AB_ROSSIYA", 72, 100000000095L, new u[0], "ru.artsofte.russiafl", 8);
    public static final c BANK_URALFINANS = new c("BANK_URALFINANS", 73, 100000000096L, new u[0], "com.isimplelab.isimplemobile.payjet", 8);
    public static final c KB_ROSTFINANS = new c("KB_ROSTFINANS", 74, 100000000098L, new u[0], "ru.ftc.faktura.rostfinance", 8);
    public static final c KB_MODULBANK = new c("KB_MODULBANK", 75, 100000000099L, new u[0], "ru.ftc.faktura.multibank", 8);
    public static final c ELEXNET = new c("ELEXNET", 76, 100000000100L, new u[0], (String) null, 12);
    public static final c KB_POIDYOM = new c("KB_POIDYOM", 78, 100000000103L, new u[0], "com.openwaygroup.ic.panda.poidem", 8);
    public static final c SBI_BANK = new c("SBI_BANK", 79, 100000000105L, new u[0], "ru.sbi.android", 8);
    public static final c CHELINDBANK = new c("CHELINDBANK", 80, 100000000106L, new u[0], "com.isimplelab.ibank.chelind", 8);
    public static final c AKIBANK = new c("AKIBANK", 81, 100000000107L, new u[0], "ru.ftc.faktura.akibank", 8);
    public static final c AZIATSKO_TIHOOKEANSKY_BANK = new c("AZIATSKO_TIHOOKEANSKY_BANK", 82, 100000000108L, new u[0], (String) null, 12);
    public static final c KB_MOSKOMMERTSBANK = new c("KB_MOSKOMMERTSBANK", 83, 100000000110L, new u[0], "com.bifit.mobile.citizen.moskb", 8);
    public static final c GARANT_INVEST_BANK = new c("GARANT_INVEST_BANK", 85, 100000000112L, new u[0], "com.isimplelab.ionic.garant.prod", 8);
    public static final c NIKO_BANK = new c("NIKO_BANK", 87, 100000000115L, new u[0], "ru.ftc.faktura.multibank", 8);
    public static final c PROBANK = new c("PROBANK", 88, 100000000117L, new u[0], (String) null, 12);
    public static final c KB_AGROPROMKREDIT = new c("KB_AGROPROMKREDIT", 89, 100000000118L, new u[0], "ru.ftc.faktura.agropromkredit", 8);
    public static final c KB_SOLIDARNOST = new c("KB_SOLIDARNOST", 90, 100000000121L, new u[0], "com.isimplelab.ibank.solidarnost", 8);
    public static final c IK_BANK = new c("IK_BANK", 91, 100000000122L, new u[0], "com.bifit.mobile.citizen.icbru", 8);
    public static final c NKO_MOBI_DENGI = new c("NKO_MOBI_DENGI", 92, 100000000123L, new u[0], (String) null, 12);
    public static final c BANK_ORENBURG = new c("BANK_ORENBURG", 93, 100000000124L, new u[0], "ru.ftc.faktura.orbank", 8);
    public static final c GORBANK = new c("GORBANK", 94, 100000000125L, new u[0], "com.isimplelab.ionic.gorbank.prod", 8);
    public static final c KHAKASSKY_MUNICIPALNY_BANK = new c("KHAKASSKY_MUNICIPALNY_BANK", 96, 100000000127L, new u[0], "ru.ftc.faktura.kbhmb", 8);
    public static final c KB_ARESBANK = new c("KB_ARESBANK", 97, 100000000129L, new u[0], "ru.ftc.faktura.multibank", 8);
    public static final c BBR_BANK = new c("BBR_BANK", 98, 100000000133L, new u[0], "com.bifit.mobile.private.bbr", 8);
    public static final c NBD_BANK = new c("NBD_BANK", 99, 100000000134L, new u[0], "ru.nbd.android", 8);
    public static final c BANK_AKCEPT = new c("BANK_AKCEPT", 100, 100000000135L, new u[0], "ru.ftc.faktura.akcept", 8);
    public static final c METKOMBANK = new c("METKOMBANK", 101, 100000000136L, new u[0], "com.metkombank.mobile", 8);
    public static final c PERVY_DORTRANSBANK = new c("PERVY_DORTRANSBANK", 102, 100000000137L, new u[0], "ru.ftc.faktura.dortrbank", 8);
    public static final c TOYOTA_BANK = new c("TOYOTA_BANK", 103, 100000000138L, new u[0], "com.isimplelab.ibank.toyota", 8);
    public static final c MB_BANK = new c("MB_BANK", 105, 100000000140L, new u[0], "com.bifit.mobile.citizen.mbb", 8);
    public static final c URALPROMBANK = new c("URALPROMBANK", 106, 100000000142L, new u[0], "ru.uralprombank.mobilebanknew.googleplay", 8);
    public static final c BANK_131 = new c("BANK_131", 107, 100000000143L, new u[0], (String) null, 12);
    public static final c TIMER_BANK = new c("TIMER_BANK", 108, 100000000144L, new u[0], "com.timerbank.retail", 8);
    public static final c KOSHELEV_BANK = new c("KOSHELEV_BANK", 109, 100000000146L, new u[0], "com.bifit.mobile.citizen.kbnk", 8);
    public static final c SINKO_BANK = new c("SINKO_BANK", 110, 100000000148L, new u[0], "com.intervale.sbp.atlas", 8);
    public static final c GUTA_BANK = new c("GUTA_BANK", 111, 100000000149L, new u[0], "com.bssys.gutaretail", 8);
    public static final c YANDEX = new c("YANDEX", 112, 100000000150L, new u[]{new u("qr.nspk.ru"), new u("sub.nspk.ru"), new u("sbpay"), new u("me2mepull.nspk.ru")}, "com.yandex.bank", 8);
    public static final c KEB_HNB_BANK = new c("KEB_HNB_BANK", 122, 100000000164L, new u[0], (String) null, 12);
    public static final c SIBSOCBANK = new c("SIBSOCBANK", 124, 100000000166L, new u[0], "ru.ftc.faktura.multibank", 8);
    public static final c MIR_PRIVILEGY = new c("MIR_PRIVILEGY", 126, 100000000169L, new u[0], (String) null, 12);
    public static final c EKONOMBANK = new c("EKONOMBANK", 150, 100000000198L, new u[0], (String) null, 12);
    public static final c DOYCHE_BANK = new c("DOYCHE_BANK", 158, 100000000207L, new u[0], (String) null, 12);
    public static final c IS_BANK = new c("IS_BANK", 179, 100000000239L, new u[0], (String) null, 12);
    public static final c NATIONALNY_RASCHEtNY_DEPOZITARY = new c("NATIONALNY_RASCHEtNY_DEPOZITARY", 180, 100000000241L, new u[0], (String) null, 12);
    public static final c BANK_NATIONALNY_STANDART = new c("BANK_NATIONALNY_STANDART", 181, 100000000243L, new u[0], "ru.ftc.faktura.ns", 8);
    public static final c MSP_BANK = new c("MSP_BANK", 183, 100000000246L, new u[0], (String) null, 12);
    public static final c ROYAL_KREDIT_BANK = new c("ROYAL_KREDIT_BANK", 197, 100000000263L, new u[0], (String) null, 12);
    public static final c BANK_ELITA = new c("BANK_ELITA", 199, 100000000266L, new u[0], "ru.elt.ubsmobile", 8);
    public static final c MB_RUS_BANK = new c("MB_RUS_BANK", 224, 100000000299L, new u[0], "ru.mcbankrus.MCBankRus", 8);
    public static final c ROCKETBANK = new c("ROCKETBANK", 226, 100000000301L, new u[0], (String) null, 12);

    static {
        int i11 = 8;
        GAZPROMBANK = new c("GAZPROMBANK", 0, 100000000001L, new u[0], "ru.gazprombank.android.mobilebank.app", i11);
        BANK_SINARA = new c("BANK_SINARA", 2, 100000000003L, new u[0], "ru.skbbank.ib", i11);
        int i12 = 8;
        POCHTA_BANK = new c("POCHTA_BANK", 14, 100000000016L, new u[0], "ru.letobank.Prometheus", i12);
        BANK_AVANGARD = new c("BANK_AVANGARD", 23, 100000000028L, new u[0], "ru.avangard.sbp_client", i12);
        UNISTREAM_BANK = new c("UNISTREAM_BANK", 32, 100000000042L, new u[0], "com.ltech.unistream", i12);
        BLANK_BANK = new c("BLANK_BANK", 41, 100000000053L, new u[0], "ru.ftc.faktura.vesta", i12);
        ZEMSKY_BANK = new c("ZEMSKY_BANK", 50, 100000000066L, new u[0], "ru.ftc.faktura.zemskybank", i12);
        ALMAZERGIENBANK = new c("ALMAZERGIENBANK", 59, 100000000080L, new u[0], "ru.albank.online.aebit", i12);
        BANK_SNGB = new c("BANK_SNGB", 68, 100000000091L, new u[0], "ru.sngb.dbo.client.android", i12);
        BANK_AGROROS = new c("BANK_AGROROS", 77, 100000000102L, new u[0], "ru.ftc.faktura.agroros", i12);
        ALEF_BANK = new c("ALEF_BANK", 86, 100000000113L, new u[0], "ru.ftc.faktura.alefbank", i12);
        BANK_SARATOV = new c("BANK_SARATOV", 95, 100000000126L, new u[0], "ru.ftc.faktura.banksaratov", i12);
        KB_ENERGOTRANSBANK = new c("KB_ENERGOTRANSBANK", 104, 100000000139L, new u[0], "ru.ftc.faktura.etbank", i12);
        int i13 = 8;
        URAL_FD = new c("URAL_FD", 113, 100000000151L, new u[0], "com.bssys.uralfdretail", i13);
        int i14 = 8;
        TOLYATTIkhimbank = new c("TOLYATTIkhimbank", 114, 100000000152L, new u[0], "com.bifit.mobile.citizen.thbank", i14);
        BANK_VENETS = new c("BANK_VENETS", 115, 100000000153L, new u[0], "ru.ftc.faktura.venetsbank", i13);
        BANK_AVERS = new c("BANK_AVERS", 116, 100000000154L, new u[0], "com.bssys.aversretail", i14);
        BANK_ITURUP = new c("BANK_ITURUP", 117, 100000000158L, new u[0], "ru.ftc.faktura.iturup", i13);
        ENERGOBANK = new c("ENERGOBANK", 118, 100000000159L, new u[0], "com.energobank.digital", i14);
        UG_INVESTBANK = new c("UG_INVESTBANK", 119, 100000000160L, new u[0], "com.bifit.mobile.citizen.invb", i13);
        KB_LOKO_BANK = new c("KB_LOKO_BANK", 120, 100000000161L, new u[0], "com.idamobile.android.LockoBank", i14);
        BANK_SNEZHINSKY = new c("BANK_SNEZHINSKY", 121, 100000000163L, new u[0], "com.compassplus.mobicash.customer", i13);
        RUSUNIVERSALBANK = new c("RUSUNIVERSALBANK", 123, 100000000165L, new u[0], "ru.rubank.ubsmobile", i13);
        AKB_EUROFINANS_MOSNARBANK = new c("AKB_EUROFINANS_MOSNARBANK", 125, 100000000167L, new u[0], "com.bifit.mobile.citizen.efbank", i13);
        BANK_INTEZA = new c("BANK_INTEZA", 127, 100000000170L, new u[0], "ru.ftc.faktura.intesabank", i13);
        int i15 = 8;
        MORSKOY_BANK = new c("MORSKOY_BANK", UserVerificationMethods.USER_VERIFY_PATTERN, 100000000171L, new u[0], "ru.ftc.faktura.maritimebank", i15);
        BANK_RAZVITIE_STOLITSA = new c("BANK_RAZVITIE_STOLITSA", 129, 100000000172L, new u[0], "ru.ftc.faktura.razvitiestolica", i13);
        TAVRICHESKY_BANK = new c("TAVRICHESKY_BANK", 130, 100000000173L, new u[0], "ru.ftc.faktura.tavrich", i15);
        PERVY_INVESTITSIONNY_BANK = new c("PERVY_INVESTITSIONNY_BANK", 131, 100000000174L, new u[0], "ru.ftc.faktura.finbank", i13);
        AKB_TENDER_BANK = new c("AKB_TENDER_BANK", 132, 100000000175L, new u[0], "com.bifit.mobile.citizen.tenderbank", i15);
        MOSCOMBANK = new c("MOSCOMBANK", 133, 100000000176L, new u[0], "ru.ftc.faktura.moscombank", i13);
        BANK_NOVIKOM = new c("BANK_NOVIKOM", 134, 100000000177L, new u[0], "com.bssys.novikomretail", i15);
        KUBAN_TORGBANK = new c("KUBAN_TORGBANK", 135, 100000000180L, new u[0], "ru.isfront.android.kt", i13);
        AVOTORGBANK = new c("AVOTORGBANK", 136, 100000000181L, new u[0], "com.bifit.atbbank", i15);
        BANK_OBEDINENNY_KAPITAL = new c("BANK_OBEDINENNY_KAPITAL", 137, 100000000182L, new u[0], "com.bifit.mobile.citizen.okbank", i13);
        GAZTRANSBANK = new c("GAZTRANSBANK", 138, 100000000183L, new u[0], "ru.ftc.faktura.gaztransbank", i15);
        AKB_NRBANK = new c("AKB_NRBANK", 139, 100000000184L, new u[0], "com.bifit.nrb", i13);
        NATSINVESTPROMBANK = new c("NATSINVESTPROMBANK", 140, 100000000185L, new u[0], "ru.ftc.faktura.nipbank", i15);
        BANK_RESO_KREDIT = new c("BANK_RESO_KREDIT", 141, 100000000187L, new u[0], "ru.ftc.faktura.resokreditbank", i13);
        TATSOBANK = new c("TATSOBANK", 142, 100000000189L, new u[0], "com.tatsotsbank.dbomobile", i15);
        KBER_BANK_KAZANI = new c("KBER_BANK_KAZANI", 143, 100000000191L, new u[0], "com.isimplelab.ionic.kazan.fl", i13);
        BANK_MBA_MOSKVA = new c("BANK_MBA_MOSKVA", 144, 100000000192L, new u[0], "ru.ibam.retailmobile", i15);
        KB_STROYLESBANK = new c("KB_STROYLESBANK", 145, 100000000193L, new u[0], "com.bssys.stroylesretail", i13);
        RUSNARBANK = new c("RUSNARBANK", 146, 100000000194L, new u[0], "ru.rusnarbank.correqts.retail", i15);
        KUZNETSKBIZNESBANK = new c("KUZNETSKBIZNESBANK", 147, 100000000195L, new u[0], "ru.ftc.faktura.kbb", i13);
        INBANK = new c("INBANK", 148, 100000000196L, new u[0], "com.inbank.mobilebank", i15);
        TRANSSTROYBANK = new c("TRANSSTROYBANK", 149, 100000000197L, new u[0], "com.intervale.sbp.atlas", i13);
        ISHBANK = new c("ISHBANK", 151, 100000000199L, new u[0], "com.bifit.pmobile.isbank", i13);
        int i16 = 8;
        AKB_SLAVIYA = new c("AKB_SLAVIYA", 152, 100000000200L, new u[0], "com.isimplelab.ionic.slavia.prod", i16);
        BANK_KREMLYOVSKY = new c("BANK_KREMLYOVSKY", 153, 100000000201L, new u[0], "ru.ftc.faktura.kremlevskiy", i13);
        NORVIK_BANK = new c("NORVIK_BANK", 154, 100000000202L, new u[0], "ru.vtkbank.android", i16);
        MEZHDUNARODNY_FINANSOVY_KLUB = new c("MEZHDUNARODNY_FINANSOVY_KLUB", 155, 100000000203L, new u[0], "ru.ftc.faktura.mfkbank", i13);
        BANK_ZARECHIE = new c("BANK_ZARECHIE", 156, 100000000205L, new u[0], "com.bifit.mobile.citizen.zarech", i16);
        TOMSKPROMSTROYBANK = new c("TOMSKPROMSTROYBANK", 157, 100000000206L, new u[0], "ru.ftc.faktura.multibank", i13);
        SEVERNY_NARODNY_BANK = new c("SEVERNY_NARODNY_BANK", 159, 100000000208L, new u[0], "com.snb.online", i13);
        int i17 = 8;
        BANK_ALEKSANDROVSKY = new c("BANK_ALEKSANDROVSKY", 160, 100000000211L, new u[0], "ru.ftc.faktura.alexbank", i17);
        KB_KROKUS_BANK = new c("KB_KROKUS_BANK", 161, 100000000212L, new u[0], "ru.krk.ubsmobile", i13);
        VUZ_BANK = new c("VUZ_BANK", 162, 100000000215L, new u[0], "cb.ibank.vuz", i17);
        BANK_FINSERVIS = new c("BANK_FINSERVIS", 163, 100000000216L, new u[0], "com.finservice.mobile", i13);
        FORA_BANK = new c("FORA_BANK", 164, 100000000217L, new u[0], "ru.briginvest.sense", i17);
        BANK_SGB = new c("BANK_SGB", 165, 100000000219L, new u[0], "com.bpc.crossplatform_trading.bpc_trading", i13);
        NOVOBANK = new c("NOVOBANK", 166, 100000000222L, new u[0], "ru.ftc.faktura.novobank", i17);
        SOCIUM_BANK = new c("SOCIUM_BANK", 167, 100000000223L, new u[0], "com.intervale.sbp.atlas", i13);
        UKB_BELGORODSOCBANK = new c("UKB_BELGORODSOCBANK", 168, 100000000225L, new u[0], "com.bifit.mobile.citizen.belsocbank", i17);
        BANK_PRIMORYE = new c("BANK_PRIMORYE", 169, 100000000226L, new u[0], "ru.ftc.faktura.multibank", i13);
        PRIO_VNESHTORGBANK = new c("PRIO_VNESHTORGBANK", 170, 100000000228L, new u[0], "com.priobank.prio", i17);
        MS_BANK_RUS = new c("MS_BANK_RUS", 171, 100000000229L, new u[0], "ru.mcbankrus.MCBankRus", i13);
        SOLID_BANK = new c("SOLID_BANK", 172, 100000000230L, new u[0], "ru.ftc.faktura.solidbank", i17);
        BANK_CENTROKREDIT = new c("BANK_CENTROKREDIT", 173, 100000000231L, new u[0], "com.compassplus.mobicash.customer", i13);
        REALIST_BANK = new c("REALIST_BANK", 174, 100000000232L, new u[0], "ru.ftc.faktura.baikalinvestbank", i17);
        NK_BANK = new c("NK_BANK", 175, 100000000233L, new u[0], "com.bifit.mobile.citizen.nkbank", i13);
        BANK_MOSKVA_SITI = new c("BANK_MOSKVA_SITI", 176, 100000000234L, new u[0], "com.bifit.mobile.citizen.MCBank", i17);
        AKB_DERZHAVA = new c("AKB_DERZHAVA", 177, 100000000235L, new u[0], "ru.ftc.faktura.derzhava", i13);
        BANK_IPB = new c("BANK_IPB", 178, 100000000236L, new u[0], "ru.ipb.ubsmobile", i17);
        int i18 = 8;
        AKB_LANTA_BANK = new c("AKB_LANTA_BANK", 182, 100000000245L, new u[0], "ru.ftc.faktura.lanta", i18);
        BANK_RAUND = new c("BANK_RAUND", 184, 100000000247L, new u[0], "com.isimplelab.ionic.round.prod", i18);
        int i19 = 8;
        VNESHFINBANK = new c("VNESHFINBANK", 185, 100000000248L, new u[0], "com.bifit.vfbank", i19);
        String str = null;
        int i21 = 12;
        INEKO = new c("INEKO", 186, 100000000249L, new u[0], str, i21);
        DRAYV_KLIK_BANK = new c("DRAYV_KLIK_BANK", 187, 100000000250L, new u[0], "com.cetelem.cetelem_android", i19);
        NKO_MKS = new c("NKO_MKS", 188, 100000000251L, new u[0], str, i21);
        String str2 = null;
        int i22 = 12;
        AVTO_FINANS_BANK = new c("AVTO_FINANS_BANK", 189, 100000000253L, new u[0], str2, i22);
        BANK_KUZNETSKY = new c("BANK_KUZNETSKY", 190, 100000000254L, new u[0], str, i21);
        BANK_PTB = new c("BANK_PTB", 191, 100000000255L, new u[0], str2, i22);
        BANK_VOLGOZHANIN = new c("BANK_VOLGOZHANIN", 192, 100000000257L, new u[0], str, i21);
        int i23 = 8;
        AIKB_YENISEYSKY_OBEDINENNY_BANK = new c("AIKB_YENISEYSKY_OBEDINENNY_BANK", 193, 100000000258L, new u[0], "ru.ftc.faktura.united", i23);
        WILDBERRIES = new c("WILDBERRIES", 194, 100000000259L, new u[0], str, i21);
        BANK_BZF = new c("BANK_BZF", 195, 100000000260L, new u[0], "ru.ftc.faktura.bgfbank", i23);
        NKO_PERSPEKTIVA = new c("NKO_PERSPEKTIVA", 196, 100000000261L, new u[0], str, i21);
        TSIFRA_BANK = new c("TSIFRA_BANK", 198, 100000000265L, new u[0], str, i21);
        STAVROPOLPROMSTROYBANK = new c("STAVROPOLPROMSTROYBANK", m.e.DEFAULT_DRAG_ANIMATION_DURATION, 100000000267L, new u[0], str, i21);
        String str3 = null;
        int i24 = 12;
        BANK_CHBRR = new c("BANK_CHBRR", 201, 100000000269L, new u[0], str3, i24);
        int i25 = 8;
        KB_DOLINSK = new c("KB_DOLINSK", 202, 100000000270L, new u[0], "ru.ftc.faktura.dolinsk", i25);
        KOSHELEK_TSUPIS = new c("KOSHELEK_TSUPIS", 203, 100000000271L, new u[0], str3, i24);
        KHAYS = new c("KHAYS", 204, 100000000272L, new u[0], "com.hicebank.android", i25);
        OZON_BANK = new c("OZON_BANK", 205, 100000000273L, new u[0], str3, i24);
        String str4 = null;
        int i26 = 12;
        BANK_PERM = new c("BANK_PERM", 206, 100000000274L, new u[0], str4, i26);
        NKO_ELEKSIR = new c("NKO_ELEKSIR", 207, 100000000275L, new u[0], str3, i24);
        ALTAYKAPITALBANK = new c("ALTAYKAPITALBANK", 208, 100000000276L, new u[0], str4, i26);
        int i27 = 8;
        FINSTAR_BANK = new c("FINSTAR_BANK", 209, 100000000278L, new u[0], "ru.ftc.faktura.siab", i27);
        SVOY_BANK = new c("SVOY_BANK", 210, 100000000279L, new u[0], str4, i26);
        CMRBANK = new c("CMRBANK", 211, 100000000282L, new u[0], "com.isimplelab.ionic.cmrbank.prod", i27);
        NDBANK = new c("NDBANK", 212, 100000000283L, new u[0], str4, i26);
        String str5 = null;
        TOCHKA_BANK = new c("TOCHKA_BANK", 213, 100000000284L, new u[0], str5, 4);
        PROMSElKHOZBANK = new c("PROMSElKHOZBANK", 214, 100000000285L, new u[0], str4, i26);
        int i28 = 12;
        BANK_ORANZHEVY = new c("BANK_ORANZHEVY", ModuleDescriptor.MODULE_VERSION, 100000000286L, new u[0], str5, i28);
        ALTERNATIVA = new c("ALTERNATIVA", 216, 100000000287L, new u[0], str4, i26);
        PLATEZHNY_KONSTRUKTOR = new c("PLATEZHNY_KONSTRUKTOR", 217, 100000000288L, new u[0], str5, i28);
        MTS_DENGI = new c("MTS_DENGI", 218, 100000000289L, new u[0], str4, i26);
        YARINTERBANK = new c("YARINTERBANK", 219, 100000000293L, new u[0], str5, i28);
        PERVOURALSKBANK = new c("PERVOURALSKBANK", 220, 100000000294L, new u[0], str4, i26);
        ZhIVAGO_BANK = new c("ZhIVAGO_BANK", 221, 100000000295L, new u[0], str5, i28);
        PLAYT = new c("PLAYT", 222, 100000000296L, new u[0], str4, i26);
        BANK_RSI = new c("BANK_RSI", 223, 100000000298L, new u[0], str5, i28);
        MEZhREGIONALNOE_OPERATSIONNOE_UFK = new c("MEZhREGIONALNOE_OPERATSIONNOE_UFK", 225, 100000000300L, new u[0], str5, i28);
        AVITO_KOSHELEK = new c("AVITO_KOSHELEK", 227, 110000000288L, new u[0], str5, i28);
        c[] a11 = a();
        $VALUES = a11;
        $ENTRIES = Xc.b.a(a11);
    }

    /* synthetic */ c(String str, int i11, long j11, u[] uVarArr, String str2, int i12) {
        this(str, i11, j11, uVarArr, (i12 & 4) != 0 ? null : str2, (i12 & 8) == 0 ? "ru.zhuck.webapp" : null);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{GAZPROMBANK, ZOLOTAYA_KORONA, BANK_SINARA, T_BANK, VTB, AK_BARS_BANK, RAIFFEISEN_BANK, ALFA_BANK, PROMSVYAZBANK, RNKB_BANK, ROSBANK, SOVCOMBANK, BANK_RUSSKY_STANDART, BANK_FK_OTKRYTIE, POCHTA_BANK, MTS_BANK, OTP_BANK, ROSSELKHOZBANK, YUMANI, HOME_CREDIT_BANK, MKB, BANK_URALSIB, KREDIT_EUROPA_BANK, BANK_AVANGARD, BANK_SANKT_PETERBURG, UNICREDIT_BANK, UBRIR, RENAISSANCE_BANK, TRANSCAPITALBANK, GENBANK, BANK_FINAM, BKS_BANK, UNISTREAM_BANK, GAZENERGOBANK, EKSPOBANK, BANK_ZENIT, METALLINVESTBANK, ABSOLYUT_BANK, BANK_VBRR, KUBAN_CREDIT, BANK_LEVOBEREZHY, BLANK_BANK, BANK_YOSHKAR_OLA, KB_KHLYNOV, VK_PAY, VLADBIZNESBANK, CENTR_INVEST, MONETA, NOKSSBANK, KREDIT_URAL_BANK, ZEMSKY_BANK, NOVY_VEK, PLATEZHI_I_RASCHETY, SDM_BANK, DATABANK, NS_BANK, BRATSKY_ANKB, RNKO_EDINAYA_KASSA, INGOSSTRAKH_BANK, ALMAZERGIENBANK, FORSHTADT, BANK_DOM_RF, DALNEVOSTOCHNY_BANK, ROSDORBANK, ELPLAT, BANK_PSCB, SKB_PRIMSOCBANK, KONTUR_BANK, BANK_SNGB, BYSTROBANK, UGLEMETBANK, CHELYABINVESTBANK, AB_ROSSIYA, BANK_URALFINANS, KB_ROSTFINANS, KB_MODULBANK, ELEXNET, BANK_AGROROS, KB_POIDYOM, SBI_BANK, CHELINDBANK, AKIBANK, AZIATSKO_TIHOOKEANSKY_BANK, KB_MOSKOMMERTSBANK, SBERBANK, GARANT_INVEST_BANK, ALEF_BANK, NIKO_BANK, PROBANK, KB_AGROPROMKREDIT, KB_SOLIDARNOST, IK_BANK, NKO_MOBI_DENGI, BANK_ORENBURG, GORBANK, BANK_SARATOV, KHAKASSKY_MUNICIPALNY_BANK, KB_ARESBANK, BBR_BANK, NBD_BANK, BANK_AKCEPT, METKOMBANK, PERVY_DORTRANSBANK, TOYOTA_BANK, KB_ENERGOTRANSBANK, MB_BANK, URALPROMBANK, BANK_131, TIMER_BANK, KOSHELEV_BANK, SINKO_BANK, GUTA_BANK, YANDEX, URAL_FD, TOLYATTIkhimbank, BANK_VENETS, BANK_AVERS, BANK_ITURUP, ENERGOBANK, UG_INVESTBANK, KB_LOKO_BANK, BANK_SNEZHINSKY, KEB_HNB_BANK, RUSUNIVERSALBANK, SIBSOCBANK, AKB_EUROFINANS_MOSNARBANK, MIR_PRIVILEGY, BANK_INTEZA, MORSKOY_BANK, BANK_RAZVITIE_STOLITSA, TAVRICHESKY_BANK, PERVY_INVESTITSIONNY_BANK, AKB_TENDER_BANK, MOSCOMBANK, BANK_NOVIKOM, KUBAN_TORGBANK, AVOTORGBANK, BANK_OBEDINENNY_KAPITAL, GAZTRANSBANK, AKB_NRBANK, NATSINVESTPROMBANK, BANK_RESO_KREDIT, TATSOBANK, KBER_BANK_KAZANI, BANK_MBA_MOSKVA, KB_STROYLESBANK, RUSNARBANK, KUZNETSKBIZNESBANK, INBANK, TRANSSTROYBANK, EKONOMBANK, ISHBANK, AKB_SLAVIYA, BANK_KREMLYOVSKY, NORVIK_BANK, MEZHDUNARODNY_FINANSOVY_KLUB, BANK_ZARECHIE, TOMSKPROMSTROYBANK, DOYCHE_BANK, SEVERNY_NARODNY_BANK, BANK_ALEKSANDROVSKY, KB_KROKUS_BANK, VUZ_BANK, BANK_FINSERVIS, FORA_BANK, BANK_SGB, NOVOBANK, SOCIUM_BANK, UKB_BELGORODSOCBANK, BANK_PRIMORYE, PRIO_VNESHTORGBANK, MS_BANK_RUS, SOLID_BANK, BANK_CENTROKREDIT, REALIST_BANK, NK_BANK, BANK_MOSKVA_SITI, AKB_DERZHAVA, BANK_IPB, IS_BANK, NATIONALNY_RASCHEtNY_DEPOZITARY, BANK_NATIONALNY_STANDART, AKB_LANTA_BANK, MSP_BANK, BANK_RAUND, VNESHFINBANK, INEKO, DRAYV_KLIK_BANK, NKO_MKS, AVTO_FINANS_BANK, BANK_KUZNETSKY, BANK_PTB, BANK_VOLGOZHANIN, AIKB_YENISEYSKY_OBEDINENNY_BANK, WILDBERRIES, BANK_BZF, NKO_PERSPEKTIVA, ROYAL_KREDIT_BANK, TSIFRA_BANK, BANK_ELITA, STAVROPOLPROMSTROYBANK, BANK_CHBRR, KB_DOLINSK, KOSHELEK_TSUPIS, KHAYS, OZON_BANK, BANK_PERM, NKO_ELEKSIR, ALTAYKAPITALBANK, FINSTAR_BANK, SVOY_BANK, CMRBANK, NDBANK, TOCHKA_BANK, PROMSElKHOZBANK, BANK_ORANZHEVY, ALTERNATIVA, PLATEZHNY_KONSTRUKTOR, MTS_DENGI, YARINTERBANK, PERVOURALSKBANK, ZhIVAGO_BANK, PLAYT, BANK_RSI, MB_RUS_BANK, MEZhREGIONALNOE_OPERATSIONNOE_UFK, ROCKETBANK, AVITO_KOSHELEK};
    }

    @NotNull
    public static Xc.a<c> b() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final long d() {
        return this.memberId;
    }

    public final String e() {
        return this.packageNameB2B;
    }

    public final String f() {
        return this.packageNameB2C;
    }

    @NotNull
    public final u[] g() {
        return this.patterns;
    }

    private c(String str, int i11, long j11, u[] uVarArr, String str2, String str3) {
        this.memberId = j11;
        this.patterns = uVarArr;
        this.packageNameB2C = str2;
        this.packageNameB2B = str3;
    }
}
