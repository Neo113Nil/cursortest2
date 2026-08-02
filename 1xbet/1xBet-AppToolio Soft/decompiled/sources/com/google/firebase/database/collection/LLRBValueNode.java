package com.google.firebase.database.collection;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.database.collection.LLRBNode;
import java.util.Comparator;

@KeepForSdk
/* loaded from: classes.dex */
public abstract class LLRBValueNode<K, V> implements LLRBNode<K, V> {
    private final V value;
    private final K zzq;
    private LLRBNode<K, V> zzr;
    private final LLRBNode<K, V> zzs;

    LLRBValueNode(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        this.zzq = k;
        this.value = v;
        this.zzr = lLRBNode == null ? LLRBEmptyNode.getInstance() : lLRBNode;
        this.zzs = lLRBNode2 == null ? LLRBEmptyNode.getInstance() : lLRBNode2;
    }

    private static LLRBNode.Color zzb(LLRBNode lLRBNode) {
        return lLRBNode.isRed() ? LLRBNode.Color.BLACK : LLRBNode.Color.RED;
    }

    private final LLRBNode<K, V> zzb() {
        if (this.zzr.isEmpty()) {
            return LLRBEmptyNode.getInstance();
        }
        LLRBValueNode<K, V> zzc = (getLeft().isRed() || getLeft().getLeft().isRed()) ? this : zzc();
        return zzc.zza(null, null, ((LLRBValueNode) zzc.zzr).zzb(), null).zzd();
    }

    private final LLRBValueNode<K, V> zzc() {
        LLRBValueNode<K, V> zzg = zzg();
        return zzg.getRight().getLeft().isRed() ? zzg.zza(null, null, null, ((LLRBValueNode) zzg.getRight()).zzf()).zze().zzg() : zzg;
    }

    private final LLRBValueNode<K, V> zzd() {
        LLRBValueNode<K, V> zze = (!this.zzs.isRed() || this.zzr.isRed()) ? this : zze();
        if (zze.zzr.isRed() && ((LLRBValueNode) zze.zzr).zzr.isRed()) {
            zze = zze.zzf();
        }
        return (zze.zzr.isRed() && zze.zzs.isRed()) ? zze.zzg() : zze;
    }

    private final LLRBValueNode<K, V> zze() {
        return (LLRBValueNode) this.zzs.copy(null, null, zza(), (LLRBValueNode) copy((Object) null, (Object) null, LLRBNode.Color.RED, (LLRBNode) null, (LLRBNode) ((LLRBValueNode) this.zzs).zzr), null);
    }

    private final LLRBValueNode<K, V> zzf() {
        return (LLRBValueNode) this.zzr.copy(null, null, zza(), null, (LLRBValueNode) copy((Object) null, (Object) null, LLRBNode.Color.RED, (LLRBNode) ((LLRBValueNode) this.zzr).zzs, (LLRBNode) null));
    }

    private final LLRBValueNode<K, V> zzg() {
        LLRBNode<K, V> lLRBNode = this.zzr;
        LLRBNode<K, V> copy = lLRBNode.copy(null, null, zzb(lLRBNode), null, null);
        LLRBNode<K, V> lLRBNode2 = this.zzs;
        return (LLRBValueNode) copy((Object) null, (Object) null, zzb(this), (LLRBNode) copy, (LLRBNode) lLRBNode2.copy(null, null, zzb(lLRBNode2), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public /* bridge */ /* synthetic */ LLRBNode copy(Object obj, Object obj2, LLRBNode.Color color, LLRBNode lLRBNode, LLRBNode lLRBNode2) {
        return copy((LLRBValueNode<K, V>) obj, obj2, color, (LLRBNode<LLRBValueNode<K, V>, Object>) lLRBNode, (LLRBNode<LLRBValueNode<K, V>, Object>) lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBValueNode<K, V> copy(K k, V v, LLRBNode.Color color, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2) {
        if (k == null) {
            k = this.zzq;
        }
        if (v == null) {
            v = this.value;
        }
        if (lLRBNode == null) {
            lLRBNode = this.zzr;
        }
        if (lLRBNode2 == null) {
            lLRBNode2 = this.zzs;
        }
        return color == LLRBNode.Color.RED ? new LLRBRedValueNode(k, v, lLRBNode, lLRBNode2) : new LLRBBlackValueNode(k, v, lLRBNode, lLRBNode2);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public K getKey() {
        return this.zzq;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBNode<K, V> getLeft() {
        return this.zzr;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBNode<K, V> getMax() {
        return this.zzs.isEmpty() ? this : this.zzs.getMax();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBNode<K, V> getMin() {
        return this.zzr.isEmpty() ? this : this.zzr.getMin();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBNode<K, V> getRight() {
        return this.zzs;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public V getValue() {
        return this.value;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public void inOrderTraversal(LLRBNode.NodeVisitor<K, V> nodeVisitor) {
        this.zzr.inOrderTraversal(nodeVisitor);
        nodeVisitor.visitEntry(this.zzq, this.value);
        this.zzs.inOrderTraversal(nodeVisitor);
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBNode<K, V> insert(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.zzq);
        return (compare < 0 ? zza(null, null, this.zzr.insert(k, v, comparator), null) : compare == 0 ? zza(k, v, null, null) : zza(null, null, null, this.zzs.insert(k, v, comparator))).zzd();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public LLRBNode<K, V> remove(K k, Comparator<K> comparator) {
        LLRBValueNode<K, V> zza;
        if (comparator.compare(k, this.zzq) < 0) {
            LLRBValueNode<K, V> zzc = (this.zzr.isEmpty() || this.zzr.isRed() || ((LLRBValueNode) this.zzr).zzr.isRed()) ? this : zzc();
            zza = zzc.zza(null, null, zzc.zzr.remove(k, comparator), null);
        } else {
            LLRBValueNode<K, V> zzf = this.zzr.isRed() ? zzf() : this;
            if (!zzf.zzs.isEmpty() && !zzf.zzs.isRed() && !((LLRBValueNode) zzf.zzs).zzr.isRed()) {
                zzf = zzf.zzg();
                if (zzf.getLeft().getLeft().isRed()) {
                    zzf = zzf.zzf().zzg();
                }
            }
            if (comparator.compare(k, zzf.zzq) == 0) {
                if (zzf.zzs.isEmpty()) {
                    return LLRBEmptyNode.getInstance();
                }
                LLRBNode<K, V> min = zzf.zzs.getMin();
                zzf = zzf.zza(min.getKey(), min.getValue(), null, ((LLRBValueNode) zzf.zzs).zzb());
            }
            zza = zzf.zza(null, null, null, zzf.zzs.remove(k, comparator));
        }
        return zza.zzd();
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public boolean shortCircuitingInOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (this.zzr.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor) && shortCircuitingNodeVisitor.shouldContinue(this.zzq, this.value)) {
            return this.zzs.shortCircuitingInOrderTraversal(shortCircuitingNodeVisitor);
        }
        return false;
    }

    @Override // com.google.firebase.database.collection.LLRBNode
    @KeepForSdk
    public boolean shortCircuitingReverseOrderTraversal(LLRBNode.ShortCircuitingNodeVisitor<K, V> shortCircuitingNodeVisitor) {
        if (this.zzs.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor) && shortCircuitingNodeVisitor.shouldContinue(this.zzq, this.value)) {
            return this.zzr.shortCircuitingReverseOrderTraversal(shortCircuitingNodeVisitor);
        }
        return false;
    }

    protected abstract LLRBNode.Color zza();

    protected abstract LLRBValueNode<K, V> zza(K k, V v, LLRBNode<K, V> lLRBNode, LLRBNode<K, V> lLRBNode2);

    void zza(LLRBNode<K, V> lLRBNode) {
        this.zzr = lLRBNode;
    }
}
