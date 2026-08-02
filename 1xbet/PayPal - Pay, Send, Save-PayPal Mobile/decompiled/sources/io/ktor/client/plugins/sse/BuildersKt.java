package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0013\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0083\u0001\u0010\u0013\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001a[\u0010\u0013\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001d\u0010\u001e\u001az\u0010%\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b#\u0010$\u001a¬\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b&\u0010'\u001a\u0084\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b(\u0010)\u001aQ\u0010+\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b*\u0010\u0012\u001a\u0083\u0001\u0010+\u001a\u00020\u0010*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b,\u0010\u001b\u001a[\u0010+\u001a\u00020\u0010*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b-\u0010\u001e\u001az\u0010/\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b.\u0010$\u001a¬\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b0\u00101\u001a\u0084\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b2\u00103\u001am\u0010\u0013\u001a\u000206*\u00020\b2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001d\u00107\u001a\u009f\u0001\u0010\u0013\u001a\u000206*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b8\u00109\u001aw\u0010\u0013\u001a\u000206*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b:\u0010;\u001a\u0096\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b<\u0010=\u001aÈ\u0001\u0010%\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b>\u0010?\u001a \u0001\u0010%\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b@\u0010A\u001am\u0010+\u001a\u000206*\u00020\b2\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b-\u00107\u001a\u009f\u0001\u0010+\u001a\u000206*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bB\u00109\u001aw\u0010+\u001a\u000206*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bC\u0010;\u001a\u0096\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b2\u0010=\u001aÈ\u0001\u0010/\u001a\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010/\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00142\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001a\u00105\u001a\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u000206\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!\u0012\u0006\u0012\u0004\u0018\u00010\"0 ¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\bF\u0010G\u001a!\u0010L\u001a\u00020J2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010M\" \u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b0N8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\" \u0010S\u001a\b\u0012\u0004\u0012\u00020\t0N8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010R\" \u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0N8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010R\" \u0010W\u001a\b\u0012\u0004\u0012\u00020\u000b0N8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bW\u0010P\u001a\u0004\bX\u0010R\"4\u0010Y\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\"0 0N8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bY\u0010P\u001a\u0004\bZ\u0010R"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/sse/SSEConfig;", "", "Lkotlin/ExtensionFunctionType;", "config", "SSE", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lkotlin/time/Duration;", "reconnectionTime", "", "showCommentEvents", "showRetryEvents", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/sse/ClientSSESession;", "serverSentEventsSession-i8z2VEo", "(Lio/ktor/client/HttpClient;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession", "", "scheme", com.datadog.android.log.LogAttributes.HOST, "", "port", "path", "serverSentEventsSession-xEWcMm4", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "serverSentEventsSession-mY9Nd3A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "serverSentEvents-mY9Nd3A", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents", "serverSentEvents-1wIb-0I", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-3bFjkrY", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sseSession-i8z2VEo", "sseSession", "sseSession-xEWcMm4", "sseSession-mY9Nd3A", "sse-mY9Nd3A", "sse", "sse-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "deserialize", "Lio/ktor/client/plugins/sse/ClientSSESessionWithDeserialization;", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession-tL6_L-A", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEventsSession-Mswn-_c", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-Mswn-_c", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-BqdlHlk", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serverSentEvents-pTj2aPc", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sseSession-tL6_L-A", "sseSession-Mswn-_c", "sse-BAHpl2s", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse-Q9yt8Vw", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", "p0", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lio/ktor/util/AttributeKey;", "sseRequestAttr", "Lio/ktor/util/AttributeKey;", "getSseRequestAttr", "()Lio/ktor/util/AttributeKey;", "reconnectionTimeAttr", "getReconnectionTimeAttr", "showCommentEventsAttr", "getShowCommentEventsAttr", "showRetryEventsAttr", "getShowRetryEventsAttr", "deserializerAttr", "getDeserializerAttr"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
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

    public static final void SSE(io.ktor.client.HttpClientConfig<?> httpClientConfig, final kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.sse.SSEConfig, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        httpClientConfig.install(io.ktor.client.plugins.sse.SSEKt.getSSE(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.m23276$r8$lambda$wM4hpVm74eAPEBdscinGyukIKE(kotlin.jvm.functions.Function1.this, (io.ktor.client.plugins.sse.SSEConfig) obj);
            }
        });
    }

    /* renamed from: serverSentEventsSession-xEWcMm4, reason: not valid java name */
    public static final java.lang.Object m23300serverSentEventsSessionxEWcMm4(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m23292serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$yqIWExI_8BLHU5ZDRDR_HUaQm0M(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m23294serverSentEventsSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m23292serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.m23272$r8$lambda$4ZIf7fkzMocGxItOccNMT34Gco(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        if (r2 != r8) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: serverSentEvents-mY9Nd3A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m23286serverSentEventsmY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1 buildersKt$serverSentEvents$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22;
        java.lang.Object m23292serverSentEventsSessioni8z2VEo;
        io.ktor.client.plugins.sse.ClientSSESession clientSSESession;
        io.ktor.client.plugins.sse.ClientSSESession clientSSESession2;
        try {
            try {
                if (continuation instanceof io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1) {
                    io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1 buildersKt$serverSentEvents$12 = (io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1) continuation;
                    if ((buildersKt$serverSentEvents$12.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        buildersKt$serverSentEvents$12.getHighSpeedVideoSizes -= 2147483648;
                        buildersKt$serverSentEvents$1 = buildersKt$serverSentEvents$12;
                        java.lang.Object obj = buildersKt$serverSentEvents$1.getHighSpeedVideoFpsRangesFor;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = buildersKt$serverSentEvents$1.getHighSpeedVideoSizes;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            function22 = function2;
                            buildersKt$serverSentEvents$1.getHighResolutionOutputSizeshNQ4ISI = function22;
                            buildersKt$serverSentEvents$1.getHighSpeedVideoSizes = 1;
                            m23292serverSentEventsSessioni8z2VEo = m23292serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, function1, buildersKt$serverSentEvents$1);
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                clientSSESession2 = (io.ktor.client.plugins.sse.ClientSSESession) buildersKt$serverSentEvents$1.getHighResolutionOutputSizeshNQ4ISI;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESession2, null, 1, null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.util.concurrent.CancellationException e) {
                                    throw e;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw getHighSpeedVideoFpsRangesFor(clientSSESession2.getCall().getResponse(), th);
                                }
                            }
                            kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function23 = (kotlin.jvm.functions.Function2) buildersKt$serverSentEvents$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            m23292serverSentEventsSessioni8z2VEo = obj;
                            function22 = function23;
                        }
                        clientSSESession = (io.ktor.client.plugins.sse.ClientSSESession) m23292serverSentEventsSessioni8z2VEo;
                        buildersKt$serverSentEvents$1.getHighResolutionOutputSizeshNQ4ISI = clientSSESession;
                        buildersKt$serverSentEvents$1.getHighSpeedVideoSizes = 2;
                        if (function22.invoke(clientSSESession, buildersKt$serverSentEvents$1) != coroutine_suspended) {
                            clientSSESession2 = clientSSESession;
                            kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESession2, null, 1, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                }
                buildersKt$serverSentEvents$1.getHighResolutionOutputSizeshNQ4ISI = clientSSESession;
                buildersKt$serverSentEvents$1.getHighSpeedVideoSizes = 2;
                if (function22.invoke(clientSSESession, buildersKt$serverSentEvents$1) != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (java.util.concurrent.CancellationException e2) {
                throw e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                clientSSESession2 = clientSSESession;
                throw getHighSpeedVideoFpsRangesFor(clientSSESession2.getCall().getResponse(), th);
            }
            if (i != 0) {
            }
            clientSSESession = (io.ktor.client.plugins.sse.ClientSSESession) m23292serverSentEventsSessioni8z2VEo;
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default((kotlinx.coroutines.CoroutineScope) buildersKt$serverSentEvents$1, null, 1, null);
            throw th3;
        }
        buildersKt$serverSentEvents$1 = new io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1(continuation);
        java.lang.Object obj2 = buildersKt$serverSentEvents$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$serverSentEvents$1.getHighSpeedVideoSizes;
    }

    /* renamed from: serverSentEvents-1wIb-0I, reason: not valid java name */
    public static final java.lang.Object m23278serverSentEvents1wIb0I(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23286serverSentEventsmY9Nd3A = m23286serverSentEventsmY9Nd3A(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$mgzwdNOd2au_mpgYwx8CBXXOPmg(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, duration, bool, bool2, function2, continuation);
        return m23286serverSentEventsmY9Nd3A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23286serverSentEventsmY9Nd3A : kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-3bFjkrY, reason: not valid java name */
    public static final java.lang.Object m23280serverSentEvents3bFjkrY(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23286serverSentEventsmY9Nd3A = m23286serverSentEventsmY9Nd3A(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$xVNzpHfubChdYnswC0pqnjidJfo(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, duration, bool, bool2, function2, continuation);
        return m23286serverSentEventsmY9Nd3A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23286serverSentEventsmY9Nd3A : kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-i8z2VEo, reason: not valid java name */
    public static final java.lang.Object m23316sseSessioni8z2VEo(io.ktor.client.HttpClient httpClient, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m23292serverSentEventsSessioni8z2VEo(httpClient, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sseSession-xEWcMm4, reason: not valid java name */
    public static final java.lang.Object m23324sseSessionxEWcMm4(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m23300serverSentEventsSessionxEWcMm4(httpClient, str, str2, num, str3, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m23318sseSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        return m23294serverSentEventsSessionmY9Nd3A(httpClient, str, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sse-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m23310ssemY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23286serverSentEventsmY9Nd3A = m23286serverSentEventsmY9Nd3A(httpClient, function1, duration, bool, bool2, function2, continuation);
        return m23286serverSentEventsmY9Nd3A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23286serverSentEventsmY9Nd3A : kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-tL6_L-A, reason: not valid java name */
    public static final java.lang.Object m23312ssetL6_LA(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23278serverSentEvents1wIb0I = m23278serverSentEvents1wIb0I(httpClient, str, str2, num, str3, duration, bool, bool2, function1, function2, continuation);
        return m23278serverSentEvents1wIb0I == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23278serverSentEvents1wIb0I : kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m23304sseMswn_c(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23280serverSentEvents3bFjkrY = m23280serverSentEvents3bFjkrY(httpClient, str, duration, bool, bool2, function1, function2, continuation);
        return m23280serverSentEvents3bFjkrY == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23280serverSentEvents3bFjkrY : kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEventsSession-tL6_L-A, reason: not valid java name */
    public static final java.lang.Object m23298serverSentEventsSessiontL6_LA(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m23295serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, (kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$kMLgUXzAEG3JHtAGOI5tUX7aVd0(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* renamed from: serverSentEventsSession-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m23290serverSentEventsSessionMswn_c(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m23295serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, (kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>) new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$WXJYobEFBOst6hEWeBpbXG_vwZc(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r2 != r9) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: serverSentEvents-Mswn-_c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m23284serverSentEventsMswn_c(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8 buildersKt$serverSentEvents$8;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function23;
        java.lang.Object m23295serverSentEventsSessionmY9Nd3A;
        io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization clientSSESessionWithDeserialization;
        io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization clientSSESessionWithDeserialization2;
        try {
            try {
                if (continuation instanceof io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8) {
                    io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8 buildersKt$serverSentEvents$82 = (io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8) continuation;
                    if ((buildersKt$serverSentEvents$82.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                        buildersKt$serverSentEvents$82.Camera2StreamConfigurationMap -= 2147483648;
                        buildersKt$serverSentEvents$8 = buildersKt$serverSentEvents$82;
                        java.lang.Object obj = buildersKt$serverSentEvents$8.getHighSpeedVideoSizes;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = buildersKt$serverSentEvents$8.Camera2StreamConfigurationMap;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            function23 = function22;
                            buildersKt$serverSentEvents$8.getHighSpeedVideoFpsRanges = function23;
                            buildersKt$serverSentEvents$8.Camera2StreamConfigurationMap = 1;
                            m23295serverSentEventsSessionmY9Nd3A = m23295serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, function1, buildersKt$serverSentEvents$8);
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                clientSSESessionWithDeserialization2 = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) buildersKt$serverSentEvents$8.getHighSpeedVideoFpsRanges;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESessionWithDeserialization2, null, 1, null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.util.concurrent.CancellationException e) {
                                    throw e;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    throw getHighSpeedVideoFpsRangesFor(clientSSESessionWithDeserialization2.getCall().getResponse(), th);
                                }
                            }
                            kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function24 = (kotlin.jvm.functions.Function2) buildersKt$serverSentEvents$8.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            m23295serverSentEventsSessionmY9Nd3A = obj;
                            function23 = function24;
                        }
                        clientSSESessionWithDeserialization = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) m23295serverSentEventsSessionmY9Nd3A;
                        buildersKt$serverSentEvents$8.getHighSpeedVideoFpsRanges = clientSSESessionWithDeserialization;
                        buildersKt$serverSentEvents$8.Camera2StreamConfigurationMap = 2;
                        if (function23.invoke(clientSSESessionWithDeserialization, buildersKt$serverSentEvents$8) != coroutine_suspended) {
                            clientSSESessionWithDeserialization2 = clientSSESessionWithDeserialization;
                            kotlinx.coroutines.CoroutineScopeKt.cancel$default(clientSSESessionWithDeserialization2, null, 1, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                }
                buildersKt$serverSentEvents$8.getHighSpeedVideoFpsRanges = clientSSESessionWithDeserialization;
                buildersKt$serverSentEvents$8.Camera2StreamConfigurationMap = 2;
                if (function23.invoke(clientSSESessionWithDeserialization, buildersKt$serverSentEvents$8) != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (java.util.concurrent.CancellationException e2) {
                throw e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                clientSSESessionWithDeserialization2 = clientSSESessionWithDeserialization;
                throw getHighSpeedVideoFpsRangesFor(clientSSESessionWithDeserialization2.getCall().getResponse(), th);
            }
            if (i != 0) {
            }
            clientSSESessionWithDeserialization = (io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization) m23295serverSentEventsSessionmY9Nd3A;
        } catch (java.lang.Throwable th3) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default((kotlinx.coroutines.CoroutineScope) buildersKt$serverSentEvents$8, null, 1, null);
            throw th3;
        }
        buildersKt$serverSentEvents$8 = new io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$8(continuation);
        java.lang.Object obj2 = buildersKt$serverSentEvents$8.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$serverSentEvents$8.Camera2StreamConfigurationMap;
    }

    /* renamed from: serverSentEvents-BqdlHlk, reason: not valid java name */
    public static final java.lang.Object m23282serverSentEventsBqdlHlk(io.ktor.client.HttpClient httpClient, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num, final java.lang.String str3, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23284serverSentEventsMswn_c = m23284serverSentEventsMswn_c(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$J5zQ4ar1DXIT5C52OsIyFbJ8__U(str, str2, num, str3, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, duration, bool, bool2, function22, continuation);
        return m23284serverSentEventsMswn_c == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23284serverSentEventsMswn_c : kotlin.Unit.INSTANCE;
    }

    /* renamed from: serverSentEvents-pTj2aPc, reason: not valid java name */
    public static final java.lang.Object m23288serverSentEventspTj2aPc(io.ktor.client.HttpClient httpClient, final java.lang.String str, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23284serverSentEventsMswn_c = m23284serverSentEventsMswn_c(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.sse.BuildersKt.$r8$lambda$joQFUgd5JiBRucIvnaWfFSn1LeI(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, duration, bool, bool2, function22, continuation);
        return m23284serverSentEventsMswn_c == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23284serverSentEventsMswn_c : kotlin.Unit.INSTANCE;
    }

    /* renamed from: sseSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m23319sseSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m23295serverSentEventsSessionmY9Nd3A(httpClient, function2, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sseSession-tL6_L-A, reason: not valid java name */
    public static final java.lang.Object m23322sseSessiontL6_LA(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m23298serverSentEventsSessiontL6_LA(httpClient, str, str2, num, str3, function2, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sseSession-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m23314sseSessionMswn_c(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        return m23290serverSentEventsSessionMswn_c(httpClient, str, function2, duration, bool, bool2, function1, continuation);
    }

    /* renamed from: sse-Mswn-_c, reason: not valid java name */
    public static final java.lang.Object m23305sseMswn_c(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23284serverSentEventsMswn_c = m23284serverSentEventsMswn_c(httpClient, function1, function2, duration, bool, bool2, function22, continuation);
        return m23284serverSentEventsMswn_c == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23284serverSentEventsMswn_c : kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-BAHpl2s, reason: not valid java name */
    public static final java.lang.Object m23302sseBAHpl2s(io.ktor.client.HttpClient httpClient, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23282serverSentEventsBqdlHlk = m23282serverSentEventsBqdlHlk(httpClient, str, str2, num, str3, function2, duration, bool, bool2, function1, function22, continuation);
        return m23282serverSentEventsBqdlHlk == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23282serverSentEventsBqdlHlk : kotlin.Unit.INSTANCE;
    }

    /* renamed from: sse-Q9yt8Vw, reason: not valid java name */
    public static final java.lang.Object m23308sseQ9yt8Vw(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object m23288serverSentEventspTj2aPc = m23288serverSentEventspTj2aPc(httpClient, str, function2, duration, bool, bool2, function1, function22, continuation);
        return m23288serverSentEventspTj2aPc == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m23288serverSentEventspTj2aPc : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable getHighSpeedVideoFpsRangesFor(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th) {
        return (!(th instanceof io.ktor.client.plugins.sse.SSEClientException) || ((io.ktor.client.plugins.sse.SSEClientException) th).getResponse() == null) ? new io.ktor.client.plugins.sse.SSEClientException(httpResponse, th, th.getMessage()) : th;
    }

    /* renamed from: serverSentEventsSession-i8z2VEo, reason: not valid java name */
    public static final java.lang.Object m23292serverSentEventsSessioni8z2VEo(io.ktor.client.HttpClient httpClient, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESession> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.sse.SSEKt.getSSE());
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        io.ktor.util.AttributeKey<java.lang.Boolean> attributeKey = sseRequestAttr;
        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        if (boxBoolean != null) {
            httpRequestBuilder.getAttributes().put(attributeKey, boxBoolean);
        }
        io.ktor.util.AttributeKey<kotlin.time.Duration> attributeKey2 = reconnectionTimeAttr;
        if (duration != null) {
            httpRequestBuilder.getAttributes().put(attributeKey2, duration);
        }
        io.ktor.util.AttributeKey<java.lang.Boolean> attributeKey3 = showCommentEventsAttr;
        if (bool != null) {
            httpRequestBuilder.getAttributes().put(attributeKey3, bool);
        }
        io.ktor.util.AttributeKey<java.lang.Boolean> attributeKey4 = showRetryEventsAttr;
        if (bool2 != null) {
            httpRequestBuilder.getAttributes().put(attributeKey4, bool2);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessioni8z2VEo$$inlined$processSessionrp2poPw$1(new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    /* renamed from: serverSentEventsSession-mY9Nd3A, reason: not valid java name */
    public static final java.lang.Object m23295serverSentEventsSessionmY9Nd3A(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function2<? super io.ktor.util.reflect.TypeInfo, ? super java.lang.String, ? extends java.lang.Object> function2, kotlin.time.Duration duration, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.ClientSSESessionWithDeserialization> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.sse.SSEKt.getSSE());
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        function1.invoke(httpRequestBuilder);
        io.ktor.util.AttributeKey<java.lang.Boolean> attributeKey = sseRequestAttr;
        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        if (boxBoolean != null) {
            httpRequestBuilder.getAttributes().put(attributeKey, boxBoolean);
        }
        io.ktor.util.AttributeKey<kotlin.time.Duration> attributeKey2 = reconnectionTimeAttr;
        if (duration != null) {
            httpRequestBuilder.getAttributes().put(attributeKey2, duration);
        }
        io.ktor.util.AttributeKey<java.lang.Boolean> attributeKey3 = showCommentEventsAttr;
        if (bool != null) {
            httpRequestBuilder.getAttributes().put(attributeKey3, bool);
        }
        io.ktor.util.AttributeKey<java.lang.Boolean> attributeKey4 = showRetryEventsAttr;
        if (bool2 != null) {
            httpRequestBuilder.getAttributes().put(attributeKey4, bool2);
        }
        io.ktor.util.AttributeKey<kotlin.jvm.functions.Function2<io.ktor.util.reflect.TypeInfo, java.lang.String, java.lang.Object>> attributeKey5 = deserializerAttr;
        if (function2 != null) {
            httpRequestBuilder.getAttributes().put(attributeKey5, function2);
        }
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

    /* renamed from: $r8$lambda$4ZIf7fkzMocGxIt-OccNMT34Gco, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23272$r8$lambda$4ZIf7fkzMocGxItOccNMT34Gco(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7Mq9ySzuySp3o9Fb3Xj8KzmzgBM(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7yZdG7SUEt73l4QDnp8C8YG0xhU(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9NHL7d74NP7Os6D9n9nWCe3TMsk(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DOYajUEdvZj1ir2lljtV2rTg550(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EPWknIGKDkBej0xR4-T0l8ywV_U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23273$r8$lambda$EPWknIGKDkBej0xR4T0l8ywV_U(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J5zQ4ar1DXIT5C52OsIyFbJ8__U(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.client.request.HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$REdV18Lv02gZuyO6lDL9Yd5GotY(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WXJYobEFBOst6hEWeBpbXG_vwZc(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WmodzxqhGRIgC42P4tZvH1klACY(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XGRNM9OcNx5AFEuR1Cz3PcR1AKY(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z4xX_16HW7IObOtq780vBCnUuCA(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$b5Ts69F-00HUtxkyPt4XX_FJjLw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23274$r8$lambda$b5Ts69F00HUtxkyPt4XX_FJjLw(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$joQFUgd5JiBRucIvnaWfFSn1LeI(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kMLgUXzAEG3JHtAGOI5tUX7aVd0(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.client.request.HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mgzwdNOd2au_mpgYwx8CBXXOPmg(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.client.request.HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nLnr9RT1B72L7TdEPoMxdPMJP-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23275$r8$lambda$nLnr9RT1B72L7TdEPoMxdPMJPw(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pdGCWioPxCHTJi7Ao6jnwDv7J1E(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qY5jwveNmxIjafdLTxAEi_wtW2k(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vpWBI3nHPTrlnr9nsLglpNWEJtE(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wM4hpVm74eAPEBdscinGyuk-IKE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23276$r8$lambda$wM4hpVm74eAPEBdscinGyukIKE(kotlin.jvm.functions.Function1 function1, io.ktor.client.plugins.sse.SSEConfig sSEConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSEConfig, "");
        function1.invoke(sSEConfig);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xVNzpHfubChdYnswC0pqnjidJfo(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y6q733vEwnjEiX3AAcallPxbpVM(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yqIWExI_8BLHU5ZDRDR_HUaQm0M(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.client.request.HttpRequestKt.url$default(httpRequestBuilder, str, str2, num, str3, null, 16, null);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zysGUXHuJ63htms05JChQ6CO-GU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23277$r8$lambda$zysGUXHuJ63htms05JChQ6COGU(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }
}
