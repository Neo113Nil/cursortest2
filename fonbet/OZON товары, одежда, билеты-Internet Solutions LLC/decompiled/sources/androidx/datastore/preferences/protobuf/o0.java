package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
final class o0 extends m0<n0, n0> {
    @Override // androidx.datastore.preferences.protobuf.m0
    final void a(n0 n0Var, int i11, int i12) {
        n0Var.j((i11 << 3) | 5, Integer.valueOf(i12));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void b(n0 n0Var, int i11, long j11) {
        n0Var.j((i11 << 3) | 1, Long.valueOf(j11));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void c(n0 n0Var, int i11, n0 n0Var2) {
        n0Var.j((i11 << 3) | 3, n0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void d(n0 n0Var, int i11, AbstractC5362h abstractC5362h) {
        n0Var.j((i11 << 3) | 2, abstractC5362h);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void e(n0 n0Var, int i11, long j11) {
        n0Var.j(i11 << 3, Long.valueOf(j11));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final n0 f(Object obj) {
        AbstractC5376w abstractC5376w = (AbstractC5376w) obj;
        n0 n0Var = abstractC5376w.unknownFields;
        if (n0Var != n0.b()) {
            return n0Var;
        }
        n0 h11 = n0.h();
        abstractC5376w.unknownFields = h11;
        return h11;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final n0 g(Object obj) {
        return ((AbstractC5376w) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final int h(n0 n0Var) {
        return n0Var.c();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final int i(n0 n0Var) {
        return n0Var.d();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void j(Object obj) {
        ((AbstractC5376w) obj).unknownFields.e();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final n0 k(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (n0.b().equals(n0Var2)) {
            return n0Var;
        }
        if (n0.b().equals(n0Var)) {
            return n0.g(n0Var, n0Var2);
        }
        n0Var.f(n0Var2);
        return n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final n0 m() {
        return n0.h();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void n(Object obj, n0 n0Var) {
        ((AbstractC5376w) obj).unknownFields = n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void o(Object obj, n0 n0Var) {
        ((AbstractC5376w) obj).unknownFields = n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final n0 p(Object obj) {
        n0 n0Var = (n0) obj;
        n0Var.e();
        return n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void q(n0 n0Var, t0 t0Var) throws IOException {
        n0Var.k(t0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    final void r(n0 n0Var, t0 t0Var) throws IOException {
        n0Var.l(t0Var);
    }
}
