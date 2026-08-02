package U30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final d JPEG;
    public static final d JPG;
    public static final d JSON;
    public static final d PDF;
    public static final d PLAIN_TEXT;
    public static final d PNG;
    public static final d TEXT;
    public static final d TEXT_UTF_8;
    public static final d TEXT_UTF_8_WITH_SPACE;
    public static final d TEXT_XML;
    public static final d UNKNOWN;
    public static final d WEBP;
    public static final d XLS;
    public static final d XLSX;
    public static final d XML;
    public static final d ZIP;

    @NotNull
    private final String extension;

    @NotNull
    private final String value;

    public static final class a {
        @NotNull
        public static ArrayList a() {
            List b02 = C7714v.b0(d.PDF, d.XLS, d.XLSX);
            ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
            Iterator it = b02.iterator();
            while (it.hasNext()) {
                String lowerCase = ((d) it.next()).d().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            return arrayList;
        }

        @NotNull
        public static ArrayList b() {
            List b02 = C7714v.b0(d.JPG, d.PNG, d.WEBP, d.JPEG);
            ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
            Iterator it = b02.iterator();
            while (it.hasNext()) {
                String lowerCase = ((d) it.next()).d().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            return arrayList;
        }

        @NotNull
        public static d c(String str) {
            Object obj;
            Iterator<E> it = d.a().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String d11 = ((d) next).d();
                Locale locale = Locale.ROOT;
                String lowerCase = d11.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (str != null) {
                    obj = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(obj, "toLowerCase(...)");
                }
                if (Intrinsics.d(lowerCase, obj)) {
                    obj = next;
                    break;
                }
            }
            d dVar = (d) obj;
            return dVar == null ? d.UNKNOWN : dVar;
        }

        public static d d(@NotNull String value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            Xc.a<d> a11 = d.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : a11) {
                if (((d) obj2) != d.UNKNOWN) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                a aVar = d.Companion;
                String lowerCase = ((d) obj).b().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(lowerCase, "<this>");
                if (h.A(value, "." + lowerCase, false)) {
                    break;
                }
            }
            return (d) obj;
        }

        @NotNull
        public static ArrayList e() {
            List b02 = C7714v.b0(d.XML, d.TEXT_XML, d.ZIP);
            ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
            Iterator it = b02.iterator();
            while (it.hasNext()) {
                String lowerCase = ((d) it.next()).d().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            return arrayList;
        }

        @NotNull
        public static ArrayList f() {
            List b02 = C7714v.b0(d.TEXT, d.PLAIN_TEXT, d.TEXT_UTF_8, d.TEXT_UTF_8_WITH_SPACE);
            ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
            Iterator it = b02.iterator();
            while (it.hasNext()) {
                String lowerCase = ((d) it.next()).d().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            return arrayList;
        }

        @NotNull
        public static Set g() {
            Xc.a<d> a11 = d.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : a11) {
                if (((d) obj) != d.UNKNOWN) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((d) it.next()).b());
            }
            return C7714v.Y0(arrayList2);
        }
    }

    static {
        d dVar = new d("JPEG", 0, "image/jpeg", "jpeg");
        JPEG = dVar;
        d dVar2 = new d("JPG", 1, "image/jpg", "jpg");
        JPG = dVar2;
        d dVar3 = new d("PNG", 2, "image/png", "png");
        PNG = dVar3;
        d dVar4 = new d("WEBP", 3, "image/webp", "webp");
        WEBP = dVar4;
        d dVar5 = new d("PDF", 4, "application/pdf", "pdf");
        PDF = dVar5;
        d dVar6 = new d("XLS", 5, "application/xls", "xls");
        XLS = dVar6;
        d dVar7 = new d("XLSX", 6, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx");
        XLSX = dVar7;
        d dVar8 = new d(SelectionItemDescriptionDTO.PLAIN_TEXT, 7, "text/plain", "txt");
        PLAIN_TEXT = dVar8;
        d dVar9 = new d("TEXT", 8, "application/txt", "txt");
        TEXT = dVar9;
        d dVar10 = new d("JSON", 9, "application/json", "json");
        JSON = dVar10;
        d dVar11 = new d("TEXT_UTF_8_WITH_SPACE", 10, "text/plain; charset=UTF-8", "txt");
        TEXT_UTF_8_WITH_SPACE = dVar11;
        d dVar12 = new d("TEXT_UTF_8", 11, "text/plain;charset=utf-8", "txt");
        TEXT_UTF_8 = dVar12;
        d dVar13 = new d("XML", 12, "application/xml", "xml");
        XML = dVar13;
        d dVar14 = new d("ZIP", 13, "application/zip", "zip");
        ZIP = dVar14;
        d dVar15 = new d("TEXT_XML", 14, "text/xml", "xml");
        TEXT_XML = dVar15;
        d dVar16 = new d(FraudMonInfo.UNKNOWN, 15, "", "");
        UNKNOWN = dVar16;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
        Companion = new a();
    }

    private d(String str, int i11, String str2, String str3) {
        this.value = str2;
        this.extension = str3;
    }

    @NotNull
    public static Xc.a<d> a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.extension;
    }

    @NotNull
    public final String d() {
        return this.value;
    }
}
