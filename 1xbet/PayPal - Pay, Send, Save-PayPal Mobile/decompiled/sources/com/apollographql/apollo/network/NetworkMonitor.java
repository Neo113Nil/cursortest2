package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/NetworkMonitor;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "Lkotlinx/coroutines/flow/StateFlow;", "", "isOnline", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NetworkMonitor extends java.io.Closeable {
    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isOnline();
}
