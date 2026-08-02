package com.payair.hce;

/* loaded from: classes4.dex */
interface TemporaryDataDao {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> delete(com.payair.hce.setZ setz);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> deleteAll();

    com.google.common.util.concurrent.ListenableFuture<java.util.List<com.payair.hce.setZ>> getAll();

    com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Long>> insert(com.payair.hce.setZ... setzArr);
}
