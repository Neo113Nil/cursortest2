package Fh0;

import J4.l;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class e extends l<Gh0.b> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull Gh0.b bVar) {
        Gh0.b bVar2 = bVar;
        fVar.e0(1, bVar2.e());
        fVar.m0(2, Eh0.a.b(bVar2.j()));
        if (bVar2.a() == null) {
            fVar.C0(3);
        } else {
            fVar.m0(3, bVar2.a().longValue());
        }
        if (bVar2.i() == null) {
            fVar.C0(4);
        } else {
            fVar.m0(4, bVar2.i().intValue());
        }
        if (bVar2.c() == null) {
            fVar.C0(5);
        } else {
            fVar.m0(5, bVar2.c().longValue());
        }
        if (bVar2.h() == null) {
            fVar.C0(6);
        } else {
            fVar.m0(6, bVar2.h().longValue());
        }
        if (bVar2.b() == null) {
            fVar.C0(7);
        } else {
            fVar.e0(7, bVar2.b());
        }
        if ((bVar2.k() == null ? null : Integer.valueOf(bVar2.k().booleanValue() ? 1 : 0)) == null) {
            fVar.C0(8);
        } else {
            fVar.m0(8, r0.intValue());
        }
        if (bVar2.g() == null) {
            fVar.C0(9);
        } else {
            fVar.e0(9, bVar2.g());
        }
        if (bVar2.f() == null) {
            fVar.C0(10);
        } else {
            fVar.e0(10, bVar2.f());
        }
        if (bVar2.d() == null) {
            fVar.C0(11);
        } else {
            fVar.e0(11, bVar2.d());
        }
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR IGNORE INTO `push_status` (`id`,`status`,`createTimestamp`,`sendingAttemptNumber`,`device_stats_id`,`pushServiceStartupTime`,`delivery_status`,`is_teens_mode`,`priority`,`original_priority`,`first_message_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    }
}
