package Zi;

import Sc.o;
import Si.InterfaceC4010a;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Yi.a f35995a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Si.d f35996b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC4010a.e, Integer, Unit> f35997c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC4010a.e, Integer, Boolean> f35998d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC4010a.e, Integer, Unit> f35999e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f36000f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC4010a.e f36001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Yi.a mediaCell, @NotNull Si.d selectionType, @NotNull Function2<? super InterfaceC4010a.e, ? super Integer, Unit> onClick, @NotNull Function2<? super InterfaceC4010a.e, ? super Integer, Boolean> onLongClick, @NotNull Function2<? super InterfaceC4010a.e, ? super Integer, Unit> onSelectionChange) {
        super(mediaCell);
        Intrinsics.checkNotNullParameter(mediaCell, "mediaCell");
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        Intrinsics.checkNotNullParameter(onSelectionChange, "onSelectionChange");
        this.f35995a = mediaCell;
        this.f35996b = selectionType;
        this.f35997c = onClick;
        this.f35998d = onLongClick;
        this.f35999e = onSelectionChange;
        this.f36000f = mediaCell.getContext();
        mediaCell.setOnClickListener(new Go.e(this, 5));
        mediaCell.setOnLongClickListener(new View.OnLongClickListener() { // from class: Zi.e
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return f.e(f.this);
            }
        });
        mediaCell.f().setOnClickListener(new DG.a(this, 8));
    }

    public static boolean e(f fVar) {
        InterfaceC4010a.e eVar = fVar.f36001g;
        if (eVar == null) {
            return false;
        }
        return fVar.f35998d.invoke(eVar, Integer.valueOf(fVar.getAdapterPosition())).booleanValue();
    }

    public static void f(f fVar) {
        InterfaceC4010a.e eVar = fVar.f36001g;
        if (eVar != null) {
            fVar.f35997c.invoke(eVar, Integer.valueOf(fVar.getAdapterPosition()));
        }
    }

    public static void g(f fVar) {
        InterfaceC4010a.e eVar = fVar.f36001g;
        if (eVar != null) {
            fVar.f35999e.invoke(eVar, Integer.valueOf(fVar.getAdapterPosition()));
        }
    }

    public final void h(@NotNull InterfaceC4010a.e media, @NotNull Set<Integer> payload) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f36001g = media;
        Iterator<T> it = payload.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int i11 = 8;
            Yi.a aVar = this.f35995a;
            if (intValue == 1) {
                AppCompatTextView f7 = aVar.f();
                f7.setText(media.isSelected() ? String.valueOf(media.c()) : "");
                f7.setSelected(media.isSelected());
                Si.d dVar = Si.d.CHECKMARK;
                Si.d dVar2 = this.f35996b;
                f7.setVisibility(dVar2 != dVar ? 0 : 8);
                AppCompatImageView e11 = aVar.e();
                if (dVar2 == dVar && media.isSelected()) {
                    i11 = 0;
                }
                e11.setVisibility(i11);
            } else if (intValue == 2) {
                com.bumptech.glide.c.n(this.f36000f).load(media.getUri()).into(aVar.d());
            } else if (intValue != 3) {
                if (intValue == 4) {
                    Ni.b.b(aVar.c(), Boolean.valueOf(media.v()));
                } else if (intValue != 5) {
                    continue;
                } else {
                    int position = media.getPosition();
                    if (media instanceof InterfaceC4010a.e.d) {
                        aVar.setContentDescription("video" + position);
                        aVar.b().setContentDescription("timeline" + position);
                        aVar.c().setContentDescription("favoriteVideo" + position);
                    } else {
                        if (!(media instanceof InterfaceC4010a.e.c)) {
                            throw new o();
                        }
                        aVar.setContentDescription("photo" + position);
                        aVar.b().setContentDescription("");
                        aVar.c().setContentDescription("favoritePhoto" + position);
                    }
                }
            } else if (media instanceof InterfaceC4010a.e.d) {
                AppCompatTextView b11 = aVar.b();
                Intrinsics.checkNotNullParameter(b11, "<this>");
                b11.setVisibility(0);
                AppCompatTextView b12 = aVar.b();
                String format = new SimpleDateFormat("mm:ss", Locale.ENGLISH).format(new Date(((InterfaceC4010a.e.d) media).f()));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                b12.setText(format);
            } else {
                AppCompatTextView b13 = aVar.b();
                Intrinsics.checkNotNullParameter(b13, "<this>");
                b13.setVisibility(8);
                aVar.b().setText("");
            }
        }
    }
}
