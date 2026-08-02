package Oi;

import B0.A0;
import Hi.h;
import Hi.j;
import Hi.k;
import Sc.s;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import cj.C5838a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    private static final Uri f20393c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String[] f20394d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f20395e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Mi.a f20396a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f20397b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.files.OzMediaFileManagerImpl$getAlbums$2", f = "OzMediaFileManager.kt", l = {112}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super List<Hi.j>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f20398d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h f20400f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20400f = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(this.f20400f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super List<Hi.j>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            k kVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f20398d;
            if (i11 == 0) {
                s.b(obj);
                Uri uri = c.f20393c;
                Intrinsics.checkNotNullExpressionValue(uri, "access$getQUERY_URI$cp(...)");
                String[] strArr = c.f20394d;
                String applyTo = this.f20400f.applyTo("media_type = 1 OR media_type = 3");
                this.f20398d = 1;
                obj = c.h(c.this, uri, strArr, applyTo, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            List list = (List) obj;
            List list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : list2) {
                Long l02 = ((k) obj3).l0();
                Object obj4 = linkedHashMap.get(l02);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap.put(l02, obj4);
                }
                ((List) obj4).add(obj3);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!((Collection) entry.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                Iterator it2 = ((Iterable) entry2.getValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((k) next).l0() != null) {
                        obj2 = next;
                        break;
                    }
                }
                k kVar2 = (k) obj2;
                if (kVar2 == null) {
                    kVar2 = (k) C7714v.K((List) entry2.getValue());
                }
                Long l03 = kVar2.l0();
                long longValue = l03 != null ? l03.longValue() : 0L;
                String b02 = kVar2.b0();
                if (b02 == null) {
                    b02 = "";
                }
                arrayList.add(new j.c(b02, ((Collection) entry2.getValue()).size(), kVar2.getUri(), longValue));
            }
            List list3 = list;
            if (list3.isEmpty()) {
                list = null;
            }
            j.a aVar2 = (list == null || (kVar = (k) C7714v.K(list)) == null) ? null : new j.a(kVar.getUri(), C5838a.b(R.string.gallery_default_folder_android), list3.size());
            if (Build.VERSION.SDK_INT >= 30) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (((k) obj5).v()) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    obj2 = new j.b(((k) C7714v.K(arrayList2)).getUri(), C5838a.b(R.string.gallery_favorites_folder_android), arrayList2.size());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            if (aVar2 != null) {
                arrayList3.add(aVar2);
            }
            if (obj2 != null) {
                arrayList3.add(obj2);
            }
            arrayList3.addAll(arrayList);
            return arrayList3;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f20393c = MediaStore.Files.getContentUri("external");
        ArrayList t2 = C7714v.t("_id", "date_modified", "mime_type", "_data", SelectionItemFormDTO.TITLE_FIELD_NAME, "duration", "bucket_id", "bucket_id", "bucket_display_name");
        if (i11 >= 30) {
            t2.add("is_favorite");
        }
        f20394d = (String[]) t2.toArray(new String[0]);
        f20395e = "date_modified DESC";
    }

    public c(@NotNull Context context, @NotNull Mi.a dispatcherProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.f20396a = dispatcherProvider;
        this.f20397b = context.getContentResolver();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final Tc.b g(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final /* synthetic */ Object h(c cVar, Uri uri, String[] strArr, String str, kotlin.coroutines.d dVar) {
        return cVar.l(uri, strArr, str, null, 0, -1, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    private final Object l(Uri uri, String[] strArr, String str, String[] strArr2, int i11, int i12, kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f20396a.a(), new f(this, uri, strArr, i11, i12, str, strArr2, null), cVar);
    }

    @Override // Oi.b
    public final Object a(@NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new Character('?'));
        }
        String b11 = A0.b("(media_type = 1 OR media_type = 3) AND _id IN (", C7714v.V(arrayList, null, null, null, null, 63), ")");
        Uri QUERY_URI = f20393c;
        Intrinsics.checkNotNullExpressionValue(QUERY_URI, "QUERY_URI");
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return l(QUERY_URI, f20394d, b11, (String[]) arrayList2.toArray(new String[0]), 0, -1, cVar);
    }

    @Override // Oi.b
    public final Object b(@NotNull Hi.d dVar, @NotNull kotlin.coroutines.d dVar2) {
        return C10727i.f(this.f20396a.a(), new e(this, dVar, null), dVar2);
    }

    @Override // Oi.b
    public final Object c(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super List<? extends Hi.j>> dVar) {
        return C10727i.f(this.f20396a.a(), new a(hVar, null), dVar);
    }

    @Override // Oi.b
    public final Object d(@NotNull Hi.d dVar, int i11, int i12, @NotNull kotlin.coroutines.d dVar2) {
        Uri QUERY_URI = f20393c;
        Intrinsics.checkNotNullExpressionValue(QUERY_URI, "QUERY_URI");
        return l(QUERY_URI, f20394d, dVar.m(), dVar.n(), i11, i12, (kotlin.coroutines.jvm.internal.c) dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // Oi.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull Uri uri, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f20403f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f20403f = i12 - LinearLayoutManager.INVALID_OFFSET;
                d dVar2 = dVar;
                Object obj = dVar2.f20401d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar2.f20403f;
                if (i11 != 0) {
                    s.b(obj);
                    dVar2.f20403f = 1;
                    obj = l(uri, null, null, null, 0, 1, dVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return C7714v.M((List) obj);
            }
        }
        dVar = new d(this, cVar);
        d dVar22 = dVar;
        Object obj3 = dVar22.f20401d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar22.f20403f;
        if (i11 != 0) {
        }
        return C7714v.M((List) obj3);
    }
}
