package com.payair.hce;

/* loaded from: classes4.dex */
interface PayairUserDataDao {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> delete(com.payair.hce.setPointerIcon setpointericon);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> deleteAll();

    com.google.common.util.concurrent.ListenableFuture<java.util.List<com.payair.hce.setPointerIcon>> getAll();

    com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Long>> insert(com.payair.hce.setPointerIcon... setpointericonArr);
}
