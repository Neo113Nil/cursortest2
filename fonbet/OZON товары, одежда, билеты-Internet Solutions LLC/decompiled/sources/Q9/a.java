package Q9;

import R9.a;
import R9.d;
import S9.a;
import Sc.o;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a implements TextWatcher, View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f23036a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private List<String> f23037b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private List<S9.c> f23038c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private R9.a f23039d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23040e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0452a f23041f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f23042g;

    /* renamed from: h, reason: collision with root package name */
    private int f23043h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final WeakReference<EditText> f23044i;

    /* renamed from: Q9.a$a, reason: collision with other inner class name */
    public interface InterfaceC0452a {
        void a(@NotNull String str, @NotNull String str2, @NotNull String str3);
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Integer.valueOf(((c) t11).a()), Integer.valueOf(((c) t2).a()));
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f23045a;

        /* renamed from: b, reason: collision with root package name */
        private final int f23046b;

        public c(@NotNull d mask, int i11) {
            Intrinsics.checkNotNullParameter(mask, "mask");
            this.f23045a = mask;
            this.f23046b = i11;
        }

        public final int a() {
            return this.f23046b;
        }

        @NotNull
        public final d b() {
            return this.f23045a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f23045a, cVar.f23045a) && this.f23046b == cVar.f23046b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f23046b) + (this.f23045a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaskAffinity(mask=");
            sb2.append(this.f23045a);
            sb2.append(", affinity=");
            return Ek.a.d(sb2, this.f23046b, ')');
        }
    }

    public a(String primaryFormat, List affineFormats, List customNotations, R9.a affinityCalculationStrategy, EditText field, InterfaceC0452a interfaceC0452a) {
        Intrinsics.checkNotNullParameter(primaryFormat, "primaryFormat");
        Intrinsics.checkNotNullParameter(affineFormats, "affineFormats");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        Intrinsics.checkNotNullParameter(affinityCalculationStrategy, "affinityCalculationStrategy");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f23036a = primaryFormat;
        this.f23037b = affineFormats;
        this.f23038c = customNotations;
        this.f23039d = affinityCalculationStrategy;
        this.f23040e = true;
        this.f23041f = interfaceC0452a;
        this.f23042g = "";
        this.f23044i = new WeakReference<>(field);
    }

    private final int a(d mask, S9.a text) {
        String str;
        int length;
        int e11;
        R9.a aVar = this.f23039d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(text, "text");
        int i11 = a.C0493a.f24813a[aVar.ordinal()];
        if (i11 == 1) {
            return mask.c(text).a();
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new o();
                }
                length = mask.c(text).b().length();
                if (length > mask.f()) {
                    return LinearLayoutManager.INVALID_OFFSET;
                }
                e11 = mask.f();
            } else {
                if (text.c().length() > mask.e()) {
                    return LinearLayoutManager.INVALID_OFFSET;
                }
                length = text.c().length();
                e11 = mask.e();
            }
            return length - e11;
        }
        String c11 = mask.c(text).c().c();
        String c12 = text.c();
        if (c11.length() == 0 || c12.length() == 0) {
            str = "";
        } else {
            int i12 = 0;
            while (i12 < c11.length() && i12 < c12.length()) {
                if (c11.charAt(i12) != c12.charAt(i12)) {
                    str = c11.substring(0, i12);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    break;
                }
                i12++;
            }
            str = c11.substring(0, i12);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str.length();
    }

    private final d b(String format, List<S9.c> customNotations) {
        HashMap hashMap;
        HashMap hashMap2;
        int i11 = d.f24818d;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        hashMap = d.f24817c;
        d dVar = (d) hashMap.get(format);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(format, customNotations);
        hashMap2 = d.f24817c;
        hashMap2.put(format, dVar2);
        return dVar2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        WeakReference<EditText> weakReference = this.f23044i;
        EditText editText = weakReference.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        if (editable != null) {
            editable.replace(0, editable.length(), this.f23042g);
        }
        try {
            EditText editText2 = weakReference.get();
            if (editText2 != null) {
                editText2.setSelection(this.f23043h);
            }
        } catch (IndexOutOfBoundsException unused) {
            Log.e("input-mask-android", "\n                    \n                    WARNING! Your text field is not configured for the MaskedTextChangedListener! \n                    For more information please refer to \n                    \n                    InputMask vs. android:inputType and IndexOutOfBoundsException\n                    https://github.com/RedMadRobot/input-mask-android#inputmask-vs-androidinputtype-and-indexoutofboundsexception\n                    ");
        }
        EditText editText3 = weakReference.get();
        if (editText3 != null) {
            editText3.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @NotNull
    public final d c(@NotNull S9.a text) {
        Intrinsics.checkNotNullParameter(text, "text");
        List<String> list = this.f23037b;
        if (list.isEmpty()) {
            return b(this.f23036a, this.f23038c);
        }
        int a11 = a(b(this.f23036a, this.f23038c), text);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            d b11 = b(it.next(), this.f23038c);
            arrayList.add(new c(b11, a(b11, text)));
        }
        if (arrayList.size() > 1) {
            C7714v.G0(new b(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            int i12 = i11 + 1;
            if (a11 >= ((c) it2.next()).a()) {
                break;
            }
            i11 = i12;
        }
        if (i11 >= 0) {
            arrayList.add(i11, new c(b(this.f23036a, this.f23038c), a11));
        } else {
            arrayList.add(new c(b(this.f23036a, this.f23038c), a11));
        }
        return ((c) C7714v.K(arrayList)).b();
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f23036a = str;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        String valueOf;
        boolean z12 = this.f23040e;
        if (z12 && z11) {
            WeakReference<EditText> weakReference = this.f23044i;
            EditText editText = weakReference.get();
            Editable text = editText != null ? editText.getText() : null;
            Intrinsics.f(text);
            if (text.length() == 0) {
                valueOf = "";
            } else {
                EditText editText2 = weakReference.get();
                valueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
            }
            S9.a aVar = new S9.a(valueOf, valueOf.length(), new a.AbstractC0516a.b(z12));
            d.b c11 = c(aVar).c(aVar);
            this.f23042g = c11.c().c();
            this.f23043h = c11.c().b();
            EditText editText3 = weakReference.get();
            if (editText3 != null) {
                editText3.setText(this.f23042g);
            }
            try {
                EditText editText4 = weakReference.get();
                if (editText4 != null) {
                    editText4.setSelection(c11.c().b());
                }
            } catch (IndexOutOfBoundsException unused) {
                Log.e("input-mask-android", "\n                        \n                    WARNING! Your text field is not configured for the MaskedTextChangedListener! \n                    For more information please refer to \n                    \n                    InputMask vs. android:inputType and IndexOutOfBoundsException\n                    https://github.com/RedMadRobot/input-mask-android#inputmask-vs-androidinputtype-and-indexoutofboundsexception\n                    ");
            }
            InterfaceC0452a interfaceC0452a = this.f23041f;
            if (interfaceC0452a != null) {
                interfaceC0452a.a(c11.b(), this.f23042g, c11.d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@NotNull CharSequence text, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        boolean z11 = i12 > 0 && i13 == 0;
        a.AbstractC0516a c0517a = z11 ? new a.AbstractC0516a.C0517a(false) : new a.AbstractC0516a.b(z11 ? false : this.f23040e);
        if (!z11) {
            i11 += i13;
        }
        S9.a aVar = new S9.a(text.toString(), i11, c0517a);
        d.b c11 = c(aVar).c(aVar);
        this.f23042g = c11.c().c();
        this.f23043h = c11.c().b();
        InterfaceC0452a interfaceC0452a = this.f23041f;
        if (interfaceC0452a != null) {
            interfaceC0452a.a(c11.b(), this.f23042g, c11.d());
        }
    }
}
