package io.ktor.client.plugins.sse;

/* compiled from: builders.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0013\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0083\u0001\u0010\u0013\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001a[\u0010\u0013\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\u001az\u0010%\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b#\u0010$\u001a¬\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b&\u0010'\u001a\u0084\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b(\u0010)\u001aQ\u0010+\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b*\u0010\u0012\u001a\u0083\u0001\u0010+\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b,\u0010\u001b\u001a[\u0010+\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b-\u0010\u001e\u001az\u0010/\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b.\u0010$\u001a¬\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b0\u00101\u001a\u0084\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b2\u00103\u001am\u0010\u0013\u001a\u000206*\u00020\b2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001d\u00107\u001a\u009f\u0001\u0010\u0013\u001a\u000206*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b8\u00109\u001aw\u0010\u0013\u001a\u000206*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b:\u0010;\u001a\u0096\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b<\u0010=\u001aÈ\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b>\u0010?\u001a \u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b@\u0010A\u001am\u0010+\u001a\u000206*\u00020\b2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b-\u00107\u001a\u009f\u0001\u0010+\u001a\u000206*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bB\u00109\u001aw\u0010+\u001a\u000206*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bC\u0010;\u001a\u0096\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b2\u0010=\u001aÈ\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bF\u0010G\u001al\u0010L\u001a\u00028\u0000\"\u0006\b\u0000\u0010H\u0018\u0001*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010I\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0082H¢\u0006\u0004\bJ\u0010K\u001a5\u0010P\u001a\u00020\u0003\"\b\b\u0000\u0010H*\u00020\"*\u00020\u000e2\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M2\b\u0010O\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\bP\u0010Q\u001a!\u0010V\u001a\u00020T2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010W\" \u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\" \u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[\" \u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\" \u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[\"4\u0010b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010[¨\u0006d"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/sse/SSEConfig;", "", "Lkotlin/ExtensionFunctionType;", com.helpshift.proactive.InAppViewConstants.CONFIG, "SSE", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lkotlin/time/Duration;", "reconnectionTime", "", "showCommentEvents", "showRetryEvents", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/sse/ClientSSESession;", "serverSentEventsSession-i8z2VEo", "(Lio/ktor/client/HttpClient;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession", "", "scheme", "host", "", "port", "path", "serverSentEventsSession-xEWcMm4", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "serverSentEventsSession-mY9Nd3A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "serverSentEvents-mY9Nd3A", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents", "serverSentEvents-1wIb-0I", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-3bFjkrY", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sseSession-i8z2VEo", "sseSession", "sseSession-xEWcMm4", "sseSession-mY9Nd3A", "sse-mY9Nd3A", "sse", "sse-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "deserialize", "Lio/ktor/client/plugins/sse/ClientSSESessionWithDeserialization;", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-Mswn-_c", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-BqdlHlk", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-pTj2aPc", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sseSession-tL6_L-A", "sseSession-Mswn-_c", "sse-BAHpl2s", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse-Q9yt8Vw", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "additionalAttributes", "processSession-rp2poPw", "(Lio/ktor/client/HttpClient;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processSession", "Lio/ktor/util/AttributeKey;", "attributeKey", "value", "addAttribute", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "", "cause", "mapToSSEException", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sseRequestAttr", "Lio/ktor/util/AttributeKey;", "getSseRequestAttr", "()Lio/ktor/util/AttributeKey;", "reconnectionTimeAttr", "getReconnectionTimeAttr", "showCommentEventsAttr", "getShowCommentEventsAttr", "showRetryEventsAttr", "getShowRetryEventsAttr", "deserializerAttr", "getDeserializerAttr", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuildersKt {
    private static final io.ktor.util.AttributeKey<kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object>> deserializerAttr;
    private static final io.ktor.util.AttributeKey<kotlin.time.Duration> reconnectionTimeAttr;
    private static final io.ktor.util.AttributeKey<java.lang.Boolean> showCommentEventsAttr;
    private static final io.ktor.util.AttributeKey<java.lang.Boolean> showRetryEventsAttr;
    private static final io.ktor.util.AttributeKey<java.lang.Boolean> sseRequestAttr;

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getSseRequestAttr() {
        return sseRequestAttr;
    }

    public static final io.ktor.util.AttributeKey<kotlin.time.Duration> getReconnectionTimeAttr() {
        return reconnectionTimeAttr;
    }

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getShowCommentEventsAttr() {
        return showCommentEventsAttr;
    }

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getShowRetryEventsAttr() {
        return showRetryEventsAttr;
    }

    public static final io.ktor.util.AttributeKey<kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object>> getDeserializerAttr() {
        return deserializerAttr;
    }

    public static final void SSE(io.ktor.client.HttpClientConfig<?> httpClientConfig, final kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.sse.SSEConfig, kotlin.Unit> config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(io.ktor.client.plugins.sse.SSEKt.getSSE(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit SSE$lambda$0;
                SSE$lambda$0 = io.ktor.client.plugins.sse.BuildersKt.SSE$lambda$0(kotlin.jvm.functions.Function1.this, (io.ktor.client.plugins.sse.SSEConfig) obj);
                return SSE$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SSE$lambda$0(kotlin.jvm.functions.Function1 function1, io.ktor.client.plugins.sse.SSEConfig install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_xEWcMm4$lambda$2(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-xEWcMm4, reason: not valid java name */
    public static final java.lang.Object m10644serverSentEventsSessionxEWcMm4(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m10636serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEventsSession_xEWcMm4$lambda$3;
                serverSentEventsSession_xEWcMm4$lambda$3 = io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_xEWcMm4$lambda$3(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEventsSession_xEWcMm4$lambda$3;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_xEWcMm4$lambda$3(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEventsSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        io.ktor.client.request.HttpRequestKt.url$default(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEventsSession);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_mY9Nd3A$lambda$4(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m10638serverSentEventsSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m10636serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEventsSession_mY9Nd3A$lambda$5;
                serverSentEventsSession_mY9Nd3A$lambda$5 = io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_mY9Nd3A$lambda$5(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEventsSession_mY9Nd3A$lambda$5;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_mY9Nd3A$lambda$5(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEventsSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        io.ktor.http.URLParserKt.takeFrom(serverSentEventsSession.getUrl(), str);
        function1.invoke(serverSentEventsSession);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: serverSentEvents-mY9Nd3A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m10630serverSentEventsmY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1 buildersKt$serverSentEvents$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22;
        java.lang.Object m10636serverSentEventsSessioni8z2VEo;
        io.ktor.client.plugins.sse.ClientSSESession clientSSESession;
        io.ktor.client.plugins.sse.ClientSSESession clientSSESession2;
        try {
            try {
                if (continuation instanceof io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1) {
                    io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1 buildersKt$serverSentEvents$12 = (io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1) continuation;
                    if ((buildersKt$serverSentEvents$12.label & Integer.MIN_VALUE) != 0) {
                        buildersKt$serverSentEvents$12.label -= Integer.MIN_VALUE;
                        buildersKt$serverSentEvents$1 = buildersKt$serverSentEvents$12;
                        java.lang.Object obj = buildersKt$serverSentEvents$1.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = buildersKt$serverSentEvents$1.label;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            function22 = function2;
                            buildersKt$serverSentEvents$1.L$0 = function22;
                            buildersKt$serverSentEvents$1.label = 1;
                            m10636serverSentEventsSessioni8z2VEo = m10636serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, function1, buildersKt$serverSentEvents$1);
                            if (m10636serverSentEventsSessioni8z2VEo == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                clientSSESession2 = (io.ktor.client.plugins.sse.ClientSSESession) buildersKt$serverSentEvents$1.L$0;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESession2, null, 1, null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.util.concurrent.CancellationException e) {
                                    throw e;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw mapToSSEException(clientSSESession2.getCall().getResponse(), th);
                                }
                            }
                            kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) buildersKt$serverSentEvents$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            m10636serverSentEventsSessioni8z2VEo = obj;
                            function22 = function23;
                        }
                        clientSSESession = (io.ktor.client.plugins.sse.ClientSSESession) m10636serverSentEventsSessioni8z2VEo;
                        buildersKt$serverSentEvents$1.L$0 = clientSSESession;
                        buildersKt$serverSentEvents$1.label = 2;
                        if (function22.invoke(clientSSESession, buildersKt$serverSentEvents$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        clientSSESession2 = clientSSESession;
                        kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESession2, null, 1, null);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                buildersKt$serverSentEvents$1.L$0 = clientSSESession;
                buildersKt$serverSentEvents$1.label = 2;
                if (function22.invoke(clientSSESession, buildersKt$serverSentEvents$1) != coroutine_suspended) {
                }
            } catch (java.util.concurrent.CancellationException e2) {
                throw e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                clientSSESession2 = clientSSESession;
                throw mapToSSEException(clientSSESession2.getCall().getResponse(), th);
            }
            if (i != 0) {
            }
            clientSSESession = (io.ktor.client.plugins.sse.ClientSSESession) m10636serverSentEventsSessioni8z2VEo;
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default((kotlinx.coroutines.CoroutineScope) buildersKt$serverSentEvents$1, null, 1, null);
            throw th3;
        }
        buildersKt$serverSentEvents$1 = new io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1(continuation);
        java.lang.Object obj2 = buildersKt$serverSentEvents$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$serverSentEvents$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_1wIb_0I$lambda$6(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-1wIb-0I, reason: not valid java name */
    public static final java.lang.Object m10622serverSentEvents1wIb0I(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10630serverSentEventsmY9Nd3A = m10630serverSentEventsmY9Nd3A(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEvents_1wIb_0I$lambda$7;
                serverSentEvents_1wIb_0I$lambda$7 = io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_1wIb_0I$lambda$7(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEvents_1wIb_0I$lambda$7;
            }
        }, duration, bool, bool2, function2, continuation);
        return m10630serverSentEventsmY9Nd3A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10630serverSentEventsmY9Nd3A : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_1wIb_0I$lambda$7(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        io.ktor.client.request.HttpRequestKt.url$default(serverSentEvents, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEvents);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_3bFjkrY$lambda$8(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-3bFjkrY, reason: not valid java name */
    public static final java.lang.Object m10624serverSentEvents3bFjkrY(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10630serverSentEventsmY9Nd3A = m10630serverSentEventsmY9Nd3A(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEvents_3bFjkrY$lambda$9;
                serverSentEvents_3bFjkrY$lambda$9 = io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_3bFjkrY$lambda$9(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEvents_3bFjkrY$lambda$9;
            }
        }, duration, bool, bool2, function2, continuation);
        return m10630serverSentEventsmY9Nd3A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10630serverSentEventsmY9Nd3A : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_3bFjkrY$lambda$9(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        io.ktor.http.URLParserKt.takeFrom(serverSentEvents.getUrl(), str);
        function1.invoke(serverSentEvents);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-i8z2VEo, reason: not valid java name */
    public static final java.lang.Object m10660sseSessioni8z2VEo(io.ktor.client.HttpClient httpClient, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m10636serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sseSession_xEWcMm4$lambda$10(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-xEWcMm4, reason: not valid java name */
    public static final java.lang.Object m10668sseSessionxEWcMm4(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m10644serverSentEventsSessionxEWcMm4(httpClient, str, str2, num, str3, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sseSession_mY9Nd3A$lambda$11(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m10662sseSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m10638serverSentEventsSessionmY9Nd3A(httpClient, str, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sse-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m10654ssemY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10630serverSentEventsmY9Nd3A = m10630serverSentEventsmY9Nd3A(httpClient, function1, duration, bool, bool2, function2, continuation);
        return m10630serverSentEventsmY9Nd3A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10630serverSentEventsmY9Nd3A : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sse_tL6_L_A$lambda$12(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-tL6_L-A, reason: not valid java name */
    public static final java.lang.Object m10656ssetL6_LA(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10622serverSentEvents1wIb0I = m10622serverSentEvents1wIb0I(httpClient, str, str2, num, str3, duration, bool, bool2, function1, function2, continuation);
        return m10622serverSentEvents1wIb0I == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10622serverSentEvents1wIb0I : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sse_Mswn__c$lambda$13(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m10648sseMswn_c(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10624serverSentEvents3bFjkrY = m10624serverSentEvents3bFjkrY(httpClient, str, duration, bool, bool2, function1, function2, continuation);
        return m10624serverSentEvents3bFjkrY == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10624serverSentEvents3bFjkrY : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_tL6_L_A$lambda$15(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-tL6_L-A, reason: not valid java name */
    public static final java.lang.Object m10642serverSentEventsSessiontL6_LA(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m10639serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, (kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEventsSession_tL6_L_A$lambda$16;
                serverSentEventsSession_tL6_L_A$lambda$16 = io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_tL6_L_A$lambda$16(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEventsSession_tL6_L_A$lambda$16;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_tL6_L_A$lambda$16(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEventsSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        io.ktor.client.request.HttpRequestKt.url$default(serverSentEventsSession, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEventsSession);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_Mswn__c$lambda$17(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m10634serverSentEventsSessionMswn_c(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m10639serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, (kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEventsSession_Mswn__c$lambda$18;
                serverSentEventsSession_Mswn__c$lambda$18 = io.ktor.client.plugins.sse.BuildersKt.serverSentEventsSession_Mswn__c$lambda$18(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEventsSession_Mswn__c$lambda$18;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEventsSession_Mswn__c$lambda$18(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEventsSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEventsSession, "$this$serverSentEventsSession");
        io.ktor.http.URLParserKt.takeFrom(serverSentEventsSession.getUrl(), str);
        function1.invoke(serverSentEventsSession);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: serverSentEvents-Mswn-_c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m10628serverSentEventsMswn_c(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8 buildersKt$serverSentEvents$8;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function23;
        java.lang.Object m10639serverSentEventsSessionmY9Nd3A;
        io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization clientSSESessionWithDeserialization;
        io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization clientSSESessionWithDeserialization2;
        try {
            try {
                if (continuation instanceof io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8) {
                    io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8 buildersKt$serverSentEvents$82 = (io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8) continuation;
                    if ((buildersKt$serverSentEvents$82.label & Integer.MIN_VALUE) != 0) {
                        buildersKt$serverSentEvents$82.label -= Integer.MIN_VALUE;
                        buildersKt$serverSentEvents$8 = buildersKt$serverSentEvents$82;
                        java.lang.Object obj = buildersKt$serverSentEvents$8.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = buildersKt$serverSentEvents$8.label;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            function23 = function22;
                            buildersKt$serverSentEvents$8.L$0 = function23;
                            buildersKt$serverSentEvents$8.label = 1;
                            m10639serverSentEventsSessionmY9Nd3A = m10639serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, function1, buildersKt$serverSentEvents$8);
                            if (m10639serverSentEventsSessionmY9Nd3A == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                clientSSESessionWithDeserialization2 = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) buildersKt$serverSentEvents$8.L$0;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESessionWithDeserialization2, null, 1, null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.util.concurrent.CancellationException e) {
                                    throw e;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw mapToSSEException(clientSSESessionWithDeserialization2.getCall().getResponse(), th);
                                }
                            }
                            kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function24 = (kotlin.jvm.functions.Function2) buildersKt$serverSentEvents$8.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            m10639serverSentEventsSessionmY9Nd3A = obj;
                            function23 = function24;
                        }
                        clientSSESessionWithDeserialization = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) m10639serverSentEventsSessionmY9Nd3A;
                        buildersKt$serverSentEvents$8.L$0 = clientSSESessionWithDeserialization;
                        buildersKt$serverSentEvents$8.label = 2;
                        if (function23.invoke(clientSSESessionWithDeserialization, buildersKt$serverSentEvents$8) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        clientSSESessionWithDeserialization2 = clientSSESessionWithDeserialization;
                        kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESessionWithDeserialization2, null, 1, null);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                buildersKt$serverSentEvents$8.L$0 = clientSSESessionWithDeserialization;
                buildersKt$serverSentEvents$8.label = 2;
                if (function23.invoke(clientSSESessionWithDeserialization, buildersKt$serverSentEvents$8) != coroutine_suspended) {
                }
            } catch (java.util.concurrent.CancellationException e2) {
                throw e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                clientSSESessionWithDeserialization2 = clientSSESessionWithDeserialization;
                throw mapToSSEException(clientSSESessionWithDeserialization2.getCall().getResponse(), th);
            }
            if (i != 0) {
            }
            clientSSESessionWithDeserialization = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) m10639serverSentEventsSessionmY9Nd3A;
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default((kotlinx.coroutines.CoroutineScope) buildersKt$serverSentEvents$8, null, 1, null);
            throw th3;
        }
        buildersKt$serverSentEvents$8 = new io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8(continuation);
        java.lang.Object obj2 = buildersKt$serverSentEvents$8.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$serverSentEvents$8.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_BqdlHlk$lambda$19(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-BqdlHlk, reason: not valid java name */
    public static final java.lang.Object m10626serverSentEventsBqdlHlk(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10628serverSentEventsMswn_c = m10628serverSentEventsMswn_c(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEvents_BqdlHlk$lambda$20;
                serverSentEvents_BqdlHlk$lambda$20 = io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_BqdlHlk$lambda$20(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEvents_BqdlHlk$lambda$20;
            }
        }, function2, duration, bool, bool2, function22, continuation);
        return m10628serverSentEventsMswn_c == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10628serverSentEventsMswn_c : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_BqdlHlk$lambda$20(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        io.ktor.client.request.HttpRequestKt.url$default(serverSentEvents, str, str2, num, str3, null, 16, null);
        function1.invoke(serverSentEvents);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_pTj2aPc$lambda$21(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-pTj2aPc, reason: not valid java name */
    public static final java.lang.Object m10632serverSentEventspTj2aPc(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10628serverSentEventsMswn_c = m10628serverSentEventsMswn_c(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit serverSentEvents_pTj2aPc$lambda$22;
                serverSentEvents_pTj2aPc$lambda$22 = io.ktor.client.plugins.sse.BuildersKt.serverSentEvents_pTj2aPc$lambda$22(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return serverSentEvents_pTj2aPc$lambda$22;
            }
        }, function2, duration, bool, bool2, function22, continuation);
        return m10628serverSentEventsMswn_c == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10628serverSentEventsMswn_c : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit serverSentEvents_pTj2aPc$lambda$22(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder serverSentEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverSentEvents, "$this$serverSentEvents");
        io.ktor.http.URLParserKt.takeFrom(serverSentEvents.getUrl(), str);
        function1.invoke(serverSentEvents);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m10663sseSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m10639serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sseSession_tL6_L_A$lambda$23(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-tL6_L-A, reason: not valid java name */
    public static final java.lang.Object m10666sseSessiontL6_LA(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m10642serverSentEventsSessiontL6_LA(httpClient, str, str2, num, str3, function2, duration, bool, bool2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sseSession_Mswn__c$lambda$24(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m10658sseSessionMswn_c(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m10634serverSentEventsSessionMswn_c(httpClient, str, function2, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m10649sseMswn_c(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10628serverSentEventsMswn_c = m10628serverSentEventsMswn_c(httpClient, function1, function2, duration, bool, bool2, function22, continuation);
        return m10628serverSentEventsMswn_c == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10628serverSentEventsMswn_c : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sse_BAHpl2s$lambda$25(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-BAHpl2s, reason: not valid java name */
    public static final java.lang.Object m10646sseBAHpl2s(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10626serverSentEventsBqdlHlk = m10626serverSentEventsBqdlHlk(httpClient, str, str2, num, str3, function2, duration, bool, bool2, function1, function22, continuation);
        return m10626serverSentEventsBqdlHlk == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10626serverSentEventsBqdlHlk : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit sse_Q9yt8Vw$lambda$26(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-Q9yt8Vw, reason: not valid java name */
    public static final java.lang.Object m10652sseQ9yt8Vw(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m10632serverSentEventspTj2aPc = m10632serverSentEventspTj2aPc(httpClient, str, function2, duration, bool, bool2, function1, function22, continuation);
        return m10632serverSentEventspTj2aPc == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10632serverSentEventspTj2aPc : kotlin.Unit.INSTANCE;
    }

    /* renamed from: processSession-rp2poPw, reason: not valid java name */
    private static final /* synthetic */ <T> java.lang.Object m10621processSessionrp2poPw(io.ktor.client.HttpClient httpClient, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super T> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.sse.SSEKt.getSSE());
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, true);
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, duration);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        function12.invoke(httpRequestBuilder);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new io.ktor.client.plugins.sse.BuildersKt$processSession$2(httpStatement, CompletableDeferred$default, null), 3, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object await = CompletableDeferred$default.await(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return await;
    }

    private static final <T> void addAttribute(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.util.AttributeKey<T> attributeKey, T t) {
        if (t != null) {
            httpRequestBuilder.getAttributes().put(attributeKey, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable mapToSSEException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th) {
        return (!(th instanceof io.ktor.client.plugins.sse.SSEClientException) || ((io.ktor.client.plugins.sse.SSEClientException) th).getResponse() == null) ? new io.ktor.client.plugins.sse.SSEClientException(httpResponse, th, th.getMessage()) : th;
    }

    /* renamed from: serverSentEventsSession-i8z2VEo, reason: not valid java name */
    public static final java.lang.Object m10636serverSentEventsSessioni8z2VEo(io.ktor.client.HttpClient httpClient, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.sse.SSEKt.getSSE());
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, duration);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessioni8z2VEo$$inlined$processSessionrp2poPw$1(new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m10639serverSentEventsSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.sse.SSEKt.getSSE());
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        addAttribute(httpRequestBuilder, sseRequestAttr, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        addAttribute(httpRequestBuilder, reconnectionTimeAttr, duration);
        addAttribute(httpRequestBuilder, showCommentEventsAttr, bool);
        addAttribute(httpRequestBuilder, showRetryEventsAttr, bool2);
        addAttribute(httpRequestBuilder, deserializerAttr, function2);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KType kType2;
        kotlin.reflect.KType kType3;
        kotlin.reflect.KType kType4;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class);
        kotlin.reflect.KType kType5 = null;
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        sseRequestAttr = new io.ktor.util.AttributeKey<>("SSERequestFlag", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.time.Duration.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(kotlin.time.Duration.class);
        } catch (java.lang.Throwable unused2) {
            kType2 = null;
        }
        reconnectionTimeAttr = new io.ktor.util.AttributeKey<>("SSEReconnectionTime", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        kotlin.reflect.KClass orCreateKotlinClass3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class);
        try {
            kType3 = kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused3) {
            kType3 = null;
        }
        showCommentEventsAttr = new io.ktor.util.AttributeKey<>("SSEShowCommentEvents", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass3, kType3));
        kotlin.reflect.KClass orCreateKotlinClass4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class);
        try {
            kType4 = kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused4) {
            kType4 = null;
        }
        showRetryEventsAttr = new io.ktor.util.AttributeKey<>("SSEShowRetryEvents", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass4, kType4));
        kotlin.reflect.KClass orCreateKotlinClass5 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.jvm.functions.Function2.class);
        try {
            kType5 = kotlin.jvm.internal.Reflection.typeOf(kotlin.jvm.functions.Function2.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.util.reflect.TypeInfo.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.nullableTypeOf(java.lang.Object.class)));
        } catch (java.lang.Throwable unused5) {
        }
        deserializerAttr = new io.ktor.util.AttributeKey<>("SSEDeserializer", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass5, kType5));
    }
}
